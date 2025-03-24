package N2AbstractFactory.client;

import N2AbstractFactory.abstractFabric.AddressBookFactory;
import N2AbstractFactory.productsInterface.Address;
import N2AbstractFactory.productsInterface.PhoneNumber;

public class AddressBook  {
    private Address address;
    private PhoneNumber phoneNumber;

    public AddressBook(AddressBookFactory factory, String streetName, String streetNumber, String floor, String door,
                       String province, String city, String country, String zipCode, String phoneNumber){
        this.address = factory.createAddress(streetName, streetNumber, floor, door, province, city, country, zipCode);
        this.phoneNumber = factory.createPhoneNumber(phoneNumber);
    }

    public AddressBook(AddressBookFactory factory, String completeAddress, String city, String country, String zipCode, String countryCode, String phoneNumber) {
        this.address = factory.createAddress(completeAddress, city, country, zipCode);
        this.phoneNumber = factory.createPhoneNumber(countryCode, phoneNumber);
    }


    public void showAdressBook(){
        System.out.println(address.getAddress());
        System.out.println(phoneNumber.getPhoneNumber());
    }
}

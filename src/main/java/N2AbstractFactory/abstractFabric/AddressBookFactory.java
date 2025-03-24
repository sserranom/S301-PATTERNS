package N2AbstractFactory.abstractFabric;

import N2AbstractFactory.productsInterface.Address;
import N2AbstractFactory.productsInterface.PhoneNumber;

public interface AddressBookFactory {
    Address createAddress(String streetName, String streetNumber, String floor, String door, String province, String city, String country, String zipCode);
    Address createAddress(String completeAddress, String city, String country, String zipCode);
    PhoneNumber createPhoneNumber(String phoneNumber);
    PhoneNumber createPhoneNumber(String countryCode,  String phoneNumber);

}

package N2AbstractFactory.concrectFabric;

import N2AbstractFactory.product.InternationalAddress;
import N2AbstractFactory.product.InternationalPhoneNumber;
import N2AbstractFactory.product.NationalAddress;
import N2AbstractFactory.product.NationalPhoneNumber;
import N2AbstractFactory.abstractFabric.AddressBookFactory;
import N2AbstractFactory.productsInterface.Address;
import N2AbstractFactory.productsInterface.PhoneNumber;

public class InternationalAddressBookFactory implements AddressBookFactory {

    @Override
    public Address createAddress(String streetName, String streetNumber, String floor, String door, String province, String city, String country, String zipCode) {
        return new NationalAddress(streetName, streetNumber, floor, door, province, city, country, zipCode);
    }

    @Override
    public Address createAddress(String completeAddress, String city, String country, String zipCode) {
        return new InternationalAddress(completeAddress, city, country, zipCode);
    }

    @Override
    public PhoneNumber createPhoneNumber(String phoneNumber) {
        return new NationalPhoneNumber(phoneNumber);
    }

    @Override
    public PhoneNumber createPhoneNumber(String countryCode, String phoneNumber) {
        return new InternationalPhoneNumber(countryCode, phoneNumber);
    }
}

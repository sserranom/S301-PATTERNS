package N2AbstractFactory.product;

import N2AbstractFactory.productsInterface.Address;

public class InternationalAddress implements Address {

    private String completeAddress, city, country, zipCode;

    public InternationalAddress(String completeAddress, String city, String country, String zipCode){
        this.completeAddress = completeAddress;
        this.city = city;
        this.country = country;
        this.zipCode = zipCode;
    }
    @Override
    public String getAddress() {
        return "Address: " + completeAddress + " City: " + city + " Country: " + country + " Zip Code: " + zipCode;
    }
}

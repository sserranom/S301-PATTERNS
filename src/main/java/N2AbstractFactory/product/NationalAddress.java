package N2AbstractFactory.product;

import N2AbstractFactory.productsInterface.Address;

public class NationalAddress implements Address {

    private String streetName, streetNumber, floor, door, province, city, country, zipCode ;

    public NationalAddress(String streetName, String streetNumber, String floor, String door, String province, String city, String country, String zipCode){
        this.streetName = streetName;
        this.streetNumber = streetNumber;
        this.floor = floor;
        this.door = door;
        this.province = province;
        this.city = city;
        this.country = country;
        this.zipCode = zipCode;
    }


    @Override
    public String getAddress() {
        return "Street Name: " + streetName + " Street Number: " + streetNumber + " Floor: " + floor + " Door: " + door + " Province: " + province + " City: " + city +
                " Country: " + country + " Zip Code: " + zipCode;
    }
}

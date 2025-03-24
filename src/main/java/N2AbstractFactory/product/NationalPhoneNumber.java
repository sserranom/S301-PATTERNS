package N2AbstractFactory.product;

import N2AbstractFactory.productsInterface.PhoneNumber;

public class NationalPhoneNumber implements PhoneNumber {

    private String phoneNumber;

    public NationalPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;

    }
    @Override
    public String getPhoneNumber() {
        return "Phone Number: " + "+34 " + phoneNumber;
    }
}

package N2AbstractFactory.product;

import N2AbstractFactory.productsInterface.PhoneNumber;

public class InternationalPhoneNumber implements PhoneNumber {
    private String countryCode, phoneNumber;

    public InternationalPhoneNumber(String countryCode, String phoneNumber){
        this.countryCode = countryCode;
        this.phoneNumber = phoneNumber;

    }
    @Override
    public String getPhoneNumber() {
        return "Phone: " + countryCode + " " + phoneNumber;
    }
}

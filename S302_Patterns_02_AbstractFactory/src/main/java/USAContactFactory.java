public class USAContactFactory implements ContactFactory {

    private String street;
    private String city;
    private String postCode;
    private String phone;

    public USAContactFactory(String street, String city, String postCode, String phone) {
        this.street = street;
        this.city = city;
        this.postCode = postCode;
        this.phone = phone;
    }

    @Override
    public Address createAddress() {
        return new USAAddress(this.street, this.city, this.postCode);
    }

    @Override
    public Phone createPhone() {
        return new USAPhone(this.phone);
    }
}

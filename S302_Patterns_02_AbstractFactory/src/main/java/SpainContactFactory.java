public class SpainContactFactory implements ContactFactory {

    private final int POST_CODE_DIGITS = 5;
    private final int MOBILE_PHONE_DIGITS = 9;
    private String address;
    private String city;
    private String postCode;
    private String phone;

    public SpainContactFactory(String address, String city, String postCode, String phone) {

        if(address == null){
            throw new IllegalStateException("Address must not be NULL");
        }

        if(address.isBlank()){
            throw new IllegalStateException("Address must not be empty");
        }

        if(city == null){
            throw new IllegalArgumentException("City must not be NULL");
        }

        if(city.isBlank()){
            throw new IllegalArgumentException("City must not be empty");
        }

        if(postCode == null){
            throw new IllegalArgumentException("Postcode must not be NULL");
        }

        if(postCode.isBlank()){
            throw new IllegalArgumentException("City must not be empty");
        }

        if(postCode.chars().count() != POST_CODE_DIGITS){
            throw new IllegalArgumentException(String.format("Post code must have %d digits", POST_CODE_DIGITS));
        }

        if(phone == null){
            throw new IllegalArgumentException("Phone number must not be NULL");
        }

        if(phone.isBlank()){
            throw new IllegalArgumentException("Phone number must not be empty");
        }

        if(phone.chars().count() != MOBILE_PHONE_DIGITS){
            throw new IllegalArgumentException(String.format("Phone number must have %d digits", MOBILE_PHONE_DIGITS));
        }

        this.address = address;
        this.city = city;
        this.postCode = postCode;
        this.phone = phone;
    }

    @Override
    public Address createAddress() {
        return new SpainAddress();
    }

    @Override
    public Contact createContact() {
        return new SpainContact();
    }
}

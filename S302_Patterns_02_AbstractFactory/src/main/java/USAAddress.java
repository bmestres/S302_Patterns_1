public class USAAddress implements Address{

    private final int POST_CODE_INPUT_DIGITS = 8;
    private String street;
    private String city;
    private String postCode;

    public USAAddress(String street, String city, String postCode) {

        if(street == null){
            throw new IllegalArgumentException("Address must not be NULL");
        }

        if(street.isBlank()){
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

        if(postCode.chars().count() != POST_CODE_INPUT_DIGITS){
            throw new IllegalArgumentException(String.format("Post code must have %d digits", POST_CODE_INPUT_DIGITS));
        }

        this.street = street;
        this.city = city;
        this.postCode = postCode;
    }

    @Override
    public String format() {
        return String.format("%s, %s, %s", this.street, this.city, this.postCode);
    }
}

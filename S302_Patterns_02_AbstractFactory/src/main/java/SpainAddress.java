public class SpainAddress implements Address {

    private final int POST_CODE_INPUT_DIGITS = 5;
    private String street;
    private String city;
    private String postCode;

    public SpainAddress(String street, String city, String postCode) {

        if(street == null){
            throw new IllegalStateException("Address must not be NULL");
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
        return String.format("%s, %s %s", this.street, this.postCode, this.city);
    }
}

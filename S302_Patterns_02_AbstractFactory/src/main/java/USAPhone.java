public class USAPhone implements Phone {

    private final int PHONE_DIGITS = 9;
    private String phone;

    public USAPhone(String phone) {

        if(phone == null){
            throw new IllegalArgumentException("Phone number must not be NULL");
        }
        if(phone.isBlank()){
            throw new IllegalArgumentException("Phone number must not be empty");
        }
        if(phone.chars().count() != PHONE_DIGITS){
            throw new IllegalArgumentException(String.format("Phone number must have %d digits", PHONE_DIGITS));
        }
        this.phone = phone;
    }

    @Override
    public String format() {
        String addedZero = "0" + this.phone;
        return String.format("+1 (%s) %s-%s", addedZero.substring(0, 2), addedZero.substring(3, 5), addedZero.substring(6, 9));
    }
}

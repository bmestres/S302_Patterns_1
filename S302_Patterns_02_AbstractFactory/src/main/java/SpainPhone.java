public class SpainPhone implements Phone{

    private final int PHONE_DIGITS = 9;
    private final String PHONE_PREFIX = "+34";
    private String phone;

    public SpainPhone(String phone) {

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
        String formatedPhone = String.format("%s %s %s %s", phone.substring(0, 3), phone.substring(3, 5), phone.substring(5, 7), phone.substring(7, 9));
        return String.format("%s %s", PHONE_PREFIX, formatedPhone);
    }
}

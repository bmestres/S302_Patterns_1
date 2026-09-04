public class USAContactFactory implements ContactFactory {

    @Override
    public Address createAddress() {
        return new USAAddress();
    }

    @Override
    public Phone createPhone() {
        return new USAPhone();
    }
}

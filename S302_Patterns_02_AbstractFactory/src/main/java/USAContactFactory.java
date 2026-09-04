public class USAContactFactory implements ContactFactory {

    @Override
    public Address createAddress() {
        return new USAAddress();
    }

    @Override
    public Contact createContact() {
        return new USAContact();
    }
}

public class Application {
    private Contact contact;
    private Address address;

    public Application(ContactFactory factory){
        this.contact = factory.createContact();
        this.address = factory.createAddress();
    }
}

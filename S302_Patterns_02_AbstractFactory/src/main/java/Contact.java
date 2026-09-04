public class Contact {
    private Phone phone;
    private Address address;

    public Contact(ContactFactory factory){

        this.address = factory.createAddress();
        this.phone = factory.createPhone();
    }

    @Override
    public String toString() {
        return String.format("Address: %s | Phone: %s", address.format(), phone.format());
    }
}

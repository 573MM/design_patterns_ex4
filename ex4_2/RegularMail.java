public class RegularMail implements ICustomerMail {
    @Override
    public void createMail() {
        System.out.println("Regular Customer Mail");
    }
}
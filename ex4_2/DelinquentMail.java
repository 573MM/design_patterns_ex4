public class DelinquentMail implements ICustomerMail {
    @Override
    public void createMail() {
        System.out.println("Delinquent Customer Mail");
    }
}
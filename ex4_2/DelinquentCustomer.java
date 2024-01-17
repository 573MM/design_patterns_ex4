public class DelinquentCustomer implements ICustomerFactory {
    private static DelinquentCustomer factory = new DelinquentCustomer();
    
    private DelinquentCustomer() {

    }

    public static DelinquentCustomer getDelinquentCustomer() {
        return factory;
    }

    @Override
    public ICustomerMail createCustomerMail() {
        return new DelinquentMail();
    }

    @Override
    public ICustomerBrochure createCustomerBrochure() {
        return new DelinquentBrochure();
    }
}

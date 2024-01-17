public class RegularCustomer implements ICustomerFactory {
    private static RegularCustomer factory = new RegularCustomer();
    
    private RegularCustomer() {

    }

    public static RegularCustomer getRegularCustomer() {
        return factory;
    }

    @Override
    public ICustomerMail createCustomerMail() {
        return new RegularMail();
    }

    @Override
    public ICustomerBrochure createCustomerBrochure() {
        return new RegularBrochure();
    }
}
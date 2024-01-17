public class MountainCustomer implements ICustomerFactory {
    private static MountainCustomer factory = new MountainCustomer();
    
    private MountainCustomer() {

    }

    public static MountainCustomer getMountainCustomer() {
        return factory;
    }

    @Override
    public ICustomerMail createCustomerMail() {
        return new MountainMail();
    }

    @Override
    public ICustomerBrochure createCustomerBrochure() {
        return new MountainBrochure();
    }
}
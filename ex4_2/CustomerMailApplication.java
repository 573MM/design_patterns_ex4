

import java.util.Scanner;

public class CustomerMailApplication {
    public static ICustomerFactory getCustomerTypeFromUser() {
        ICustomerFactory customerType = null;
        Scanner inp = new Scanner(System.in);
        System.out.print("Please choose customer type 1. Regular, 2. Mountain, 3. Delinquent ");
        int type = inp.nextInt();
        switch(type) {
            case 1:
                customerType = RegularCustomer.getRegularCustomer();
                break;
            case 2:
                customerType = MountainCustomer.getMountainCustomer();
                break;
            case 3:
                customerType = DelinquentCustomer.getDelinquentCustomer();
                break;
        }
        inp.close();
        return customerType;
    }
    public static void giveToCustomer(ICustomerMail mail, ICustomerBrochure brochure) {
        mail.createMail();
        brochure.createBrochure();
    }
    
    public static void main(String[] args) {
        ICustomerFactory customer = getCustomerTypeFromUser();
        ICustomerMail mail = customer.createCustomerMail();
        ICustomerBrochure brochure = customer.createCustomerBrochure();
        giveToCustomer(mail, brochure);  
    }
}
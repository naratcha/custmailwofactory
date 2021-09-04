package customermailapplication;

public class CustomerFactory {
    public static Customer createCustomer (String type) {
        Customer crm = null;
        switch(type) {
            case "Regular" :
                crm = new RegularCustomer();
                break;
            case "Mountain" :
                crm = new MountainCustomer();
                break;
            case "Delinquent" :
                crm = new DelinquentCustomer();
                break;
        }
        return crm;
    }
}
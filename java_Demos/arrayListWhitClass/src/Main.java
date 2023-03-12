import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    //müşteri array listesi:
        ArrayList <Customer> customers =new ArrayList<Customer>();
        customers.add(new Customer(1,"Doğukan","Öztürk"));
        customers.add(new Customer(2,"Volkan","Öztürk"));
        customers.add(new Customer(3,"Emine","Topal"));

        customers.remove(0);

        for (Customer customer:customers){
            System.out.println(customer.firstName);
            System.out.println(customer.lastName);
            System.out.println(customer.id);
        }


    }
}
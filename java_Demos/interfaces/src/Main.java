public class Main {
    //interface ler referans tutucudurlar ve abstract class lar gibi bunlarda new lenemez
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager(new SqlServerCustomerDal());
        customerManager.Add();


    }
}
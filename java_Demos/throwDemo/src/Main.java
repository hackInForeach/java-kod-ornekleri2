public class Main {
    public static void main(String[] args) {
        AccountManager manager=new AccountManager();
        System.out.println("para yokken: "+manager.getBalance());
        manager.deposit(40);
        System.out.println("Hesap = "+manager.getBalance());
        try {
            manager.whitdraw(170.12);
        }catch (BalanceInSufficentException exception){
            System.out.println(exception.getMessage());
        }
        System.out.println("Hesap = "+manager.getBalance());
        try {
            manager.whitdraw(90);
        }catch (BalanceInSufficentException exception){
            System.out.println(exception.getMessage());
        }

    }
}
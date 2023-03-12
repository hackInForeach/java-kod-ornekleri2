public class AccountManager {
    private double balance;// dışarıdan değiştirmemesi için private

    public void deposit (double amount){//yatırılan para
        balance = getBalance() + amount;
    }
    public void whitdraw(double amount) throws BalanceInSufficentException{//cekilen para
        if (balance>=amount){
            balance = getBalance() - amount;
        }else {
            throw new BalanceInSufficentException("Bakiye yetersiz!");
        }
    }
    public double getBalance() {//para miktarını okuma
        return balance;
    }
}

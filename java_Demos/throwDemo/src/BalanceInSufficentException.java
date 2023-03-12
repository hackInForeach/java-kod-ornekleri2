public class BalanceInSufficentException extends Exception {
    // hata yönetimi için kendi exception ımızı
    // yazdık başka bir class da ve inherite edilmesini sağladık Exception dan!

    // hata türüne göre doğru aksiyon alınaması için hata fırlatılır
    String message;
    public BalanceInSufficentException(String message){
        this.message=message;
    }
    @Override
    public String getMessage() {
        return this.message;
    }
}

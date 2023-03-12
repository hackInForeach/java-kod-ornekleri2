public class CustomerManager {
    private BaseLogger logger; // özel alan oluşturuldu
    public CustomerManager(BaseLogger logger){ //
        this.logger=logger;
    }
    public void add(){
        System.out.println("Müşteri eklendi");
        this.logger.log("log mesajı");
    }
}

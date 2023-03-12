public class ProductManager {
    public void add(Produckt produckt){
        if (ProducktValidator.isValidate(produckt)) {
            System.out.println("Ürün eklendi");
        }else {
            System.out.println("Ürün bilgileri geçersiz");
        }

    }
}

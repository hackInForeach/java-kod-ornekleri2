public class Main {
    public static void main(String[] args) {
        ProductManager productManager=new ProductManager();
        Produckt produckt=new Produckt();
        produckt.price = 10;
        produckt.name="Şeker";
        produckt.id=1;
        productManager.add(produckt);

    }
}
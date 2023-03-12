public class Main {
    public static void main(String[] args) {
        //overloding yani aşırı yüklenme
        Product product = new Product(
                1,
                "Leptop",
                "Asus",
                5000,
                2
        );// buruda çalıştı yapıcı blok

        product.setId(1);
        product.setName("Laptop");
        product.setDescription("Asus Laptop");
        product.setPrice(5000);
        product.setStockAmount(3)

        ;
        product.getCode();
        ProductManager productManager = new ProductManager();
        productManager.Add(product);
        System.out.println("Ürünün kodu: "+product.getCode());


    }
}
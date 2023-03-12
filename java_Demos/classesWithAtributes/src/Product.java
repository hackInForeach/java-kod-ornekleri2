public class Product {
    //yapıcı block
    public Product(
            int id,
            String name,
            String description,
            double price,
            int stockAmount
    ){

        System.out.println("Yapıcı block çalıştı");
    }
    public Product(){

    }
    // bir class aynı zamanda Atteibute yani özellik barındırır
    //private= sadece tanımlandığı block için yani bir üstündeki süslü parantezde geçerlidir!!
    private int id;
    private String name;
    private String description;
    private double price;
    private int stockAmount;
    private String code;

    /*
        //getter bloğu
        public int getId(){ // get= sadece okuyabilir
            return _id;
        }

        //setter bloğu
        public void setId(int id){
            //this.id=id;// this. benim içerisinde bulunduğum class demek
            _id=id;
        }
         */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getCode() {
        return this.name.substring(0, 1) + id;
    }


}

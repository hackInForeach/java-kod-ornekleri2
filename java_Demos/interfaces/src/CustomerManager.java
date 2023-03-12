public class CustomerManager  {
    /*// BU BİRİNC YÖNYEM
    ICustomerDal customerDal;
    public void Add(){
        //iş kodları
        customerDal.Add();
    }

     */
    //BUDA İKİNCİ AMA DAHA İYİ OLAN YÖNTEM

    private ICustomerDal customerDal;

    public CustomerManager(ICustomerDal customerDal){
        this.customerDal=customerDal;
    }
    public void Add(){
        customerDal.Add();
    }


}

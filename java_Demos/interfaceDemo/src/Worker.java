//bizim çalışanımız
public class Worker implements IWorkable,IEateble,IPayable{
    @Override
    public void work(){
        System.out.println("Bizim çalışanımız");
    }
    @Override
    public void eat(){
        System.out.println("Çalışanımızın yemeği");
    }
    @Override
    public void pay(){
        System.out.println("Bizim çalışanımızın aylık maaşı");
    }
}

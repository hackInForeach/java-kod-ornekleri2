public class Main {
    public static void main(String[] args) {
//        BaseDataBaseManager[] baseDataBaseManagers =new BaseDataBaseManager[]{
//                new OracleDataBaseManager(),new SqlServerDataBaseManager()
//        };
//
//        for (BaseDataBaseManager dataBaseManagers:baseDataBaseManagers){
//            dataBaseManagers.getData();
//        }
        CustomerManager customerManager = new CustomerManager();
        ///customerManager.dataBaseManager = new SqlServerDataBaseManager();
        //customerManager.dataBaseManager = new OracleDataBaseManager();
        customerManager.dataBaseManager = new MySqlServerDataBaseManager();// örnekleme yapıldıktan sonra abstract sınıflı bir bir class kullanılabilir!!!
        customerManager.getCustomers();
    }
}
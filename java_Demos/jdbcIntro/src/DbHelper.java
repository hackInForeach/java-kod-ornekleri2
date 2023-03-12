import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbHelper {
    private String userName="root";
    private String passwords="Dogukan.123!";
    private String dbUrl="jdbc:mysql://localhost:3306/world?useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(dbUrl,userName,passwords);
    }
    public void showErrorMessage(SQLException exception){
        System.out.println("Eror: "+exception.getMessage());
        System.out.println("Error : "+exception.getErrorCode());
    }

}

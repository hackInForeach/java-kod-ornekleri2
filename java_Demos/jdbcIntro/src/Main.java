import java.sql.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        DbHelper dbHelper = new DbHelper();

        //buradan sql veri tabanına ulaşmakiçin: cümlecik:Statement
        PreparedStatement statement = null;
        //insert ifadeleri PreparedStatement ifadesiyle yapılır
        ResultSet resultSet;

        try {

            connection = dbHelper.getConnection();
            statement=connection.prepareStatement("insert into city (Name, CountryCode, District, Population) values('Düzce','TUR','Düzce',1123456)");
            statement.executeUpdate();
            System.out.println("Kayıt Eklendi : Etkilenen saysı = "+statement.executeUpdate());
        } catch (SQLException exception) {
            dbHelper.showErrorMessage(exception);
        } finally {
            statement.close();
            connection.close();
        }


    }
    public static void selectDemo() throws SQLException{
        Connection connection = null;
        DbHelper dbHelper = new DbHelper();

        //buradan sql veri tabanına ulaşmakiçin: cüölecik:Statement
        Statement statement = null;
        ResultSet resultSet;

        try {

            connection = dbHelper.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select Code,Name,Continent,Region from country");
            ArrayList<Country> countries= new ArrayList<Country>();

            while (resultSet.next()){ // .next tek tek gez demek
                countries.add(new Country(
                        resultSet.getString("Code"),
                        resultSet.getString("Name"),
                        resultSet.getString("Continent"),
                        resultSet.getString("Region")
                ));

            }
            System.out.println(countries.size());
        } catch (SQLException exception) {
            dbHelper.showErrorMessage(exception);
        } finally {
            connection.close();
        }
    }
}
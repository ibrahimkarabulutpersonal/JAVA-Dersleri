import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException{
        Connection connection = null;
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/world","root","12345");
            System.out.println("Bağlantı Sağlandı");
        }catch(SQLException e){
            e.printStackTrace();
            System.out.println("Bağlantı Sağlanmadı Tekrar Deneyiniz...");
        }finally{
            connection.close();
        }
    }
}

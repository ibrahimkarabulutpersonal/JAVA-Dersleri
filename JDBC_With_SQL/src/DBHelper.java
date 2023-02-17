import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBHelper {
    String DBUrl = "jdbc:mysql://localhost:3306/world";
    String DBName = "root";
    String DBPass = "12345";
    public Connection createMyConnection() throws SQLException {
        return DriverManager.getConnection(DBUrl, DBName, DBPass);
    }
    public void logError(SQLException e){
        System.out.println("Hata Kodu: "+e.getErrorCode());
        System.out.println("Hata Mesajı: "+e);
        System.out.println("Hata Loglandı");
    }
}

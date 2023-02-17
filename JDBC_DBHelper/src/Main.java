import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException{
        Connection connection = null;
        DBHelper dbHelper = new DBHelper();
        try{
            connection = dbHelper.createMyConnection();
        } catch (SQLException e) {
            dbHelper.logError(e);
        }finally{
            connection.close();
        }
    }
}

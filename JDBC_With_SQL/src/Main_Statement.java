import java.sql.*;

public class Main_Statement {
    public static void main(String[] args) throws SQLException{
        DBHelper dbHelper = new DBHelper();
        Connection connection = null;
        Statement statement;
        ResultSet resultSet;
        try{
            connection = dbHelper.createMyConnection();
            System.out.println("Bağlantı Sağlandı");
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select Code,Name,Continent,Region from Country");
            while(resultSet.next()){
                System.out.println(resultSet.getString("name")+" -> "+resultSet.getString("region"));
            }
        }catch(SQLException e){
            dbHelper.logError(e);
        }finally{
            connection.close();
        }
    }
}

import java.sql.*;

public class Main_PreparedStatement {
    public static void main(String[] args) throws SQLException{
        DBHelper dbHelper = new DBHelper();
        Connection connection = null;
        PreparedStatement preparedStatement;
        ResultSet resultSet;
        try{
            connection = dbHelper.createMyConnection();
            System.out.println("Bağlantı Sağlandı");
            preparedStatement = connection.prepareStatement("insert into city (Name,CountryCode,District,Population) values (\"islambol\",\"TUR\",\"Karadeniz\",22000000)");
            System.out.println(preparedStatement.executeUpdate());
            String sql = "insert into city (Name,CountryCode,District,Population) values(?,?,?,?)";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,"Afrika");
            preparedStatement.setString(2,"TUR");
            preparedStatement.setString(3,"Middle East");
            preparedStatement.setInt(4,200000);
            System.out.println(preparedStatement.executeUpdate());
        }catch(SQLException e){
            dbHelper.logError(e);
        }finally{
            connection.close();
        }
    }
}

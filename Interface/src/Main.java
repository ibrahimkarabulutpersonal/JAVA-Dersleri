public class Main {
    public static void main(String[] args){
        Customer_Manager mySql = new Customer_Manager(new MySql(),new MySql());
        mySql.database();
        mySql.repository();

        Customer_Manager oracle = new Customer_Manager(new Oracle(),new Oracle());
        oracle.database();
        oracle.repository();
    }
}

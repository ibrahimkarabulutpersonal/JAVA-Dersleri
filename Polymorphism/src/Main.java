public class Main {
    public static void main(String[] args){
        Customer_Manager customerManager = new Customer_Manager(new Database_Logger(), new Email_Logger());
        customerManager.log();
    }
}

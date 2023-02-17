public class Main {
    public static void main(String[] args){
        Customer_Manager customerManager = new Customer_Manager(new Oracle_Database());
        customerManager.getData();
    }
}

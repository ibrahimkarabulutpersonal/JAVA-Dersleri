public class Customer_Manager {
    Base_Database baseDatabase;
    public Customer_Manager(Base_Database name){
        this.baseDatabase = name;
    }
    public void getData(){
        baseDatabase.getData();
    }
}

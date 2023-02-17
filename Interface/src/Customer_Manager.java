public class Customer_Manager {
    IDatabase database;
    IRepository repository;
    Customer_Manager(IDatabase database, IRepository repository){
        this.database = database;
        this.repository = repository;
    }
    public void database(){
        database.database();
    }
    public void repository(){
        repository.repository();
    }
}

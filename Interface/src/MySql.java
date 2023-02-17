public class MySql implements IDatabase,IRepository{
    @Override
    public void database(){
        System.out.println("MySql Database");
    }
    public void repository(){
        System.out.println("Open Source");
    }
}

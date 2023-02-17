public class Oracle implements IDatabase,IRepository{
    @Override
    public void database(){
        System.out.println("Oracle Database");
    }
    public void repository(){
        System.out.println("Oracle Company");
    }
}

public class Main {
    public static void main(String[] args){
        Account_Manager accountManager = new Account_Manager();
        System.out.println("Hesap: "+accountManager.getBalance());
        accountManager.deposit(100);
        accountManager.withDraw(30);
        accountManager.withDraw(50);
        accountManager.withDraw(60);
    }
}

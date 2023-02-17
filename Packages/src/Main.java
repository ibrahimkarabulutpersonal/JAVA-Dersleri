import Mathematics.Four_Transactions;
public class Main {
    public static void main(String[] args){
        Four_Transactions fourTransactions = new Four_Transactions();
        System.out.println(fourTransactions.gather(5,20));
        System.out.println(fourTransactions.subtract(5,20));
        System.out.println(fourTransactions.impact(5,20));
        System.out.println(fourTransactions.divide(5,20));
    }
}

public class Account_Manager {
    private double balance;
    public void deposit(double amount){
        balance += amount;
        System.out.println(amount+" TL yatırıldı Hesap tutar: "+balance);
    }
    public void withDraw(double amount) throws AccountBalanceInsufficentException {
        if(balance >= amount){
            balance -= amount;
            System.out.println(amount+" TL Çekildi Kalan Tutar: "+balance);
        }else{
            throw new AccountBalanceInsufficentException("Yetersiz Bakiye Hesabınızdan "+(amount-balance)+" Tl Fazla tutar girdiniz");
        }
    }
    public double getBalance(){
        return balance;
    }
}

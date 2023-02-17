public class AccountBalanceInsufficentException extends Exception{
    String message;
    public AccountBalanceInsufficentException(String message){
        this.message = message;
    }
    @Override
    public String getMessage(){
        return message;
    }
}

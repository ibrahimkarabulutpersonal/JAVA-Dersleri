import java.sql.SQLException;

public class Main {
    public static void main(String[] args){
        int[] numbers = {10,25,35};
        try{
            System.out.println(numbers[5]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }catch(Exception e){
            System.out.println(e);
        }finally{
            System.out.println("sistemi sorunsuz şekilde sonlandırmaktır hedefim");
        }
    }
}

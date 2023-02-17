import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args){
        File myFile = new File("students.txt");
        try{
            myFile.createNewFile();
            if(myFile.exists()){
                System.out.println("Dosya Zaten Mevcut");
            }else{
                myFile.createNewFile();
                System.out.println("Yeni Dosya Oluşturuldu");
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}

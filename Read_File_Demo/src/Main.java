import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File myFile = new File("numbers.txt");
        BufferedReader reader = null;
        int total = 0;
        try{
            myFile.createNewFile();
            reader = new BufferedReader(new FileReader(myFile));
            String line = null;
            while((line = reader.readLine()) != null){
                total += Integer.valueOf(line);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            reader.close();
        }
        System.out.println(total);
    }
}

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedWriter bufferedWriter = null;
        try{
            bufferedWriter = new BufferedWriter(new FileWriter("students.txt",true));
            bufferedWriter.write("Abdullah Ökmen");
            System.out.println("Dosyaya Yazıldı");
            bufferedWriter.flush();
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            bufferedWriter.close();
        }
    }
}

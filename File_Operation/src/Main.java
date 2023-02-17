import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        File myFile = new File("not.txt");
        Scanner scanner;
        FileWriter fileWriter;
        try{
            myFile.createNewFile();
            scanner = new Scanner(myFile);
            fileWriter = new FileWriter(myFile);
            fileWriter.write("Naber Kanka");
            fileWriter.flush();
            while(scanner.hasNext()){
                System.out.println(scanner.next());
            }
            scanner.close();
            fileWriter.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

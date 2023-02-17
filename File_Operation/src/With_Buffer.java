import java.io.*;

public class With_Buffer {
    public static void main(String[] args){
        File myFile = new File("notBuffer.txt");
        try{
            myFile.createNewFile();
            FileReader fileReader = new FileReader(myFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            FileWriter fileWriter = new FileWriter(myFile);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("Naber Kanka Buffer ile aran nasıl ?");
            bufferedWriter.newLine();
            bufferedWriter.append("İyilik kanka sen nasılsın");
            bufferedWriter.flush();
            for(byte x=0; x<10; x++){
                System.out.println((char) (bufferedReader.read()) +": "+ bufferedReader.read());
            }

            System.out.println(bufferedReader.readLine());
            System.out.println(bufferedReader.readLine());
            fileReader.close();
            bufferedReader.close();
            fileWriter.close();
            bufferedWriter.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

public class Multidimensional_Array {
    public static void main(String[] args){
        String[][] tableName = new String[2][2];
        tableName[0][0] = "Ahmet";
        tableName[0][1] = "Muhammed";
        tableName[1][0] = "Mehmet";
        tableName[1][1] = "Mustafa";
        for(byte i=0; i<2; i++){
            for(byte x=0; x<2; x++){
                System.out.println(tableName[i][x]);
            }
        }
    }
}

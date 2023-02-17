public class Array {
    public static void main(String[] args){
        //1.Yöntem
        String[] names = {"Ahmet", "Muhammed", "Mehmet"};

        //2.Yöntem
        String[] names2 = new String[]{"Mustafa", "Mahmut", "Muhammed"};

        //3.Yöntem
        String[] names3 = new String[3];
        names3[0] = "Muhammed";
        names3[1] = "Mustafa";
        names3[2] = "Ahmet";

        //Çıktı almak için
        for(byte i=0; i<3; i++){
            System.out.println(names[i]);
            System.out.println(names2[i]);
        }

        //Dizilere özel çıktı almak için
        for(String isim:names3){
            System.out.println(isim);
        }
    }
}

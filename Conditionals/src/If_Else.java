public class If_Else {
    public static void main(String[] args){
        byte value = 68;
        //Klasik Yöntem
        if(value >= 75){
            System.out.println("Notunuz İyi");
        }else if(value >= 50){
            System.out.println("Notunuz Orta");
        }else{
            System.out.println("Notunuz Düşük");
        }

        //Eğer işlem tek satırdan ibaret ise süslü parantezlere gerek yok.
        if(value >= 75) System.out.println("Notunuz İyi");

        //Inline koşul yöntemi
        String sonuc = (value >= 75) ? "Notunuz İyi" : (value >= 50) ? "Notunuz Orta" : "Notunuz Düşük";
    }
}

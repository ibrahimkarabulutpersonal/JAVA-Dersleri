public class Switch {
    public static void main(String[] args){
        char character = 'a';
        //Klasik Yöntem break kullanmazsan bütün kodlar çalışır
        switch(character){
            case 'a':
                System.out.println("Karakter a'dır");
                break;
            case 'b':
                System.out.println("Karakter b'dir");
                break;
            default:
                System.out.println("Karakter Bulunamadı");
                break;
        }

        //Yeni Yöntem break kullanmana gerek yok
        switch(character){
            case 'A' -> System.out.println("Karakter A'dır");
            case 'B' -> System.out.println("Karakter B'dır");
            default -> System.out.println("Karakter Bulunamadı");
        }
    }
}

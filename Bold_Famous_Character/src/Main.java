public class Main {
    public static void main(String[] args){
        char value = 'a';
        switch(value){
            case 'a', 'ı', 'o', 'u':
                System.out.println("Kalın Ünlü");
                break;
            default:
                System.out.println("Bu Değer Koşulu Karşılamıyor");
                break;
        }
    }
}

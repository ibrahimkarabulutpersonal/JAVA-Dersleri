public class Main {
    public static void main(String[] args){
        byte value = 10, answer = 0;
        for(int i=1; i<=value; i++) if(value % i == 0) answer += i;
        System.out.println(answer == value ? "Mükemmel Sayı" : "Mükemmel Sayı Değil");
    }
}

public class Main {
    public static void main(String[] args){
        int value = 13;
        boolean isPrime = false;
        if(value > 1){
            for(int i=2; i<value; i++){
                if(value % i != 0){
                    isPrime = true;
                    break;
                }
            }
        }else{
            System.out.println("Sayı 1'e Eşit Veya Küçüktür");
        }
        String answer = isPrime ? "Asaldır" : "Asal Değil";
        System.out.println(answer);
    }
}

public class Main {
    public static void main(String[] args){
        int valueA = 220, valueB = 284, allA = 0, allB = 0;
        for(int x=1; x<valueA; x++) if(valueA % x == 0) allA+=x;
        for(int y=1; y<valueA; y++) if((valueB % y) == 0) allB+=y;
        if((allA == valueB) && (allB == valueA)) System.out.println("Arkadaş sayılardır");
        else System.out.println("Arkadaş sayı değiller");
    }
}

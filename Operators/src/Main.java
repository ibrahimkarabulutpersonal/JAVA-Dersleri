public class Main {
    public static void main(String[] args) {
        //Aritmetik Operatörler
        System.out.println("2 + 5 = " + (2 + 5));
        System.out.println("9 - 3 = " + (9 - 3));
        System.out.println("6 * 8 = " + (6 * 8));
        System.out.println("8 / 4 = " + (8 / 4));

        //Tekli Operatörler
        int a = 5;
        a++;
        System.out.println("\n"+"a + 1 = " + a);
        a--;
        System.out.println("a - 1 = " + a);
        boolean b = true;
        System.out.println("b'nin tersi " + !b);

        //Atama Operatörleri
        byte c = 126;
        c = -128;
        System.out.println("c = " + c);
        System.out.println("c + 5 = " + (c += 5));
        System.out.println("c - 3 = " + (c -= 3));
        System.out.println("c * 8 = " + (c *= 8));
        System.out.println("c / 4 = " + (c /= 4));

        //İlişkisel Operatörler
        byte d = 125;
        System.out.println(d > 200);
        System.out.println(d < 200);
        System.out.println(d >= 200);
        System.out.println(d <= 200);
        System.out.println(d != 200);
        System.out.println(d == 200);

        //Mantıksal Operatörler
        boolean x = true, y = false;
        if(x & y) System.out.println("ikiside doğru");
        if(x && y) System.out.println("sağdaki doğru soldaki doğru");
        if(x == y) System.out.println("ikiside eşit");
        if(x | y) System.out.println("sadece biri doğru");
        if(x || y) System.out.println("en az biri doğru");
    }
}

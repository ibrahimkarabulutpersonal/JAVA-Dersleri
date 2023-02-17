public class Main {
    public static void main(String[] args){
        //var ortak değişken türüdür hepsini kapsar
        var isim = "İbrahim";
        System.out.println("Var: " + isim);

        //değişken türünü girdikten sonra aynı türden olanları , ekleyerek yanyana tanımlayabilirsin.

        //doğru veya yanlış 8 Bit = 1 Byte
        boolean booleanMin = false, booleanMax = true;
        System.out.println("Boolean: " + booleanMin + " - " + booleanMax);

        //-128 ile 127 arası integer değerleri alır 8 Bit = 1 Byte
        byte byteMin = -128, byteMax = 127;
        System.out.println("Byte: " + byteMin + " - " + byteMax);

        //karakter belirtmede kullanılır 16 Bit = 2 Byte
        char character = 'C';
        System.out.println("Char: " + character);

        //-32768 ile 32767 arası integer değer alır 16 Bit = 2 Byte
        short shortMin = -32768, shortMax = 32767;
        System.out.println("Short: " + shortMin + " - " + shortMax);

        //-2147483648 ile 2147483647 arası integer değer alır 32 Bit = 4 Byte
        int intMin = -2147483648, intMax = 2147483647;
        System.out.println("Int: " + intMin + " - " + intMax);

        //+-19 haneli integer değer alır sonuna l eklenmeli 64 Bit = 8 Byte
        long longMin = -9223372036854775808l, longMax = 9223372036854775807l;
        System.out.println("Long: " + longMin + " - " + longMax);

        //ondalıklı sayıları alır sonuna f eklenmeli 32 Bit = 4 Byte
        float floatMin = -10.10f, floatMax = 10.10f;
        System.out.println("Float: " + floatMin + " - " + floatMax);

        //float tan daha çok değer atanabilir 64 Bit = 8 Byte
        double doubleMin = -20.20, doubleMax = 20.20;
        System.out.println("Double: " + doubleMin + " - " + doubleMax);

        //Javada type değiştirmek için
        int myInt = 9;
        double myDouble = myInt;
        //2.Yöntem
        double myDouble2 = 9.78d;
        int myInt2 = (int) myDouble;
    }
}

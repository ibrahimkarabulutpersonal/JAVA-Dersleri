public class Main {
    public static void main(String[] args){
        String name = "Kullanıcı adı İbrahim";
        //Herhangi birşeyin uzunuluğunu öğrenmek için
        System.out.println(name.length());

        //Sonuna ekleme yapmak için
        System.out.println(name.concat(" Karabulut"));

        //Değer ilk nerede kullanılmış
        System.out.println(name.indexOf("r"));

        //Değer en son nerede kullanılmış
        System.out.println(name.lastIndexOf("r"));

        //Değer bunun ile mi başlamış
        System.out.println(name.startsWith("İ"));

        //Değer bunun ile mi bitmiş
        System.out.println(name.endsWith("l"));

        //Değer içeriğini büyük harflere dönüştür
        System.out.println(name.toUpperCase());

        //Değer içeriğini küçük harflere dönüştür
        System.out.println(name.toLowerCase());

        //Belli bir değeri değiştirmek için
        System.out.println(name.replace("İ","I"));

        //Belli bir aralığı bastırmak için
        System.out.println(name.substring(2,7));

        //Bir değeri çağırmak için
        System.out.println(name.charAt(5));

        //Belli bir bölümü başka bir değişkene atama
        char[] characters = new char[7];
        name.getChars(0,7,characters,0);
        for(char chars:characters){
            System.out.println(chars);
        }

        //Değerin sağındaki ve solundaki boşlukları temizlemek için
        System.out.println(name.trim());

        //Değeri belli aralıklara bölme ve atama
        byte number = 0;
        String[] keywords = new String[3];
        for(String value:name.split(" ")){
            keywords[number++] = value;
        }
    }
}

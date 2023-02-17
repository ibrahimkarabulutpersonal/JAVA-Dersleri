import java.util.HashMap;
public class Main {
    public static void main(String[] args){
        HashMap<String,String> translate = new HashMap<String,String>();
        translate.put("World","Dünya");
        translate.put("Celebrity","Kutlamak");
        translate.put("Car","Araba");
        translate.replace("World","Dünya","Yalan Dünya");
        System.out.println(translate.get("World"));

        //1.Yöntem
        for(String keys:translate.keySet()){
            System.out.println(keys);
        }
        for(String values: translate.values()){
            System.out.println(values);
        }

        //2.Yöntem
        for(String print:translate.keySet()){
            System.out.println(translate.get(print));
        }
    }
}

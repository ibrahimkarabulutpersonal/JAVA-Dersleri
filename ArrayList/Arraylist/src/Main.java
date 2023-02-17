import java.util.ArrayList;
public class Main {
    public static void main(String[] args){
        ArrayList arrayList = new ArrayList();
        arrayList.clear(); //Listdeki herşeyi silmeye yarar
        arrayList.add("İbrahim");
        arrayList.add("Karabulut");
        arrayList.add(22);
        arrayList.add(3,"Evli Değil");
        arrayList.add("Askerlik Yapılmadı");
        arrayList.remove(4); //arrayList.remove("Askerlik Yapılmadı");
        for(Object print:arrayList){
            System.out.println(print);
        }
        System.out.println(arrayList.size());
        ArrayList<String> names = new ArrayList<String>();
        names.add("İbrahim");
        for(String printNames:names){
            System.out.println(printNames);
        }
    }
}

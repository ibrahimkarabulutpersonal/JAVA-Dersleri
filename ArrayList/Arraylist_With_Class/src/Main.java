import java.util.ArrayList;
import java.util.Collections;
public class Main {
    public static void main(String[] args){
        ArrayList<Customer> customerList = new ArrayList<Customer>();
        customerList.add(new Customer(001, "Adem", "Karabulut"));
        customerList.add(new Customer(002, "Semra", "Karabulut"));
        customerList.add(new Customer(003, "İbrahim", "Karabulut"));
        customerList.add(new Customer(004, "Yusuf", "Karabulut"));
        customerList.add(new Customer(005, "Muhammet Faruk", "Karabulut"));
        customerList.add(new Customer(006, "Nisanur", "Karabulut"));
        customerList.add(new Customer(007, "Abdulbaki", "Karabulut"));
        //Aşağıdaki kod çalışmaz çünkü hem newledin hem sildin
        //customerList.remove(new Customer(003, "İbrahim", "Karabulut"));
        Customer customerMan = new Customer(003,"İbrahim","Karabulut");
        customerList.remove(customerMan);
        ArrayList<String> names = new ArrayList<String>();
        for(Customer print:customerList){
            System.out.println(print.id+" "+print.firstName+" "+print.lastName);
            names.add(print.firstName);
        }
        Collections.sort(names);
        for(String printer:names){
            System.out.println(printer);
        }
    }
}

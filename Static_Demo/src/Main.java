import javax.xml.crypto.Data;

public class Main {
    public static void main(String[] args){
        Database_Helper databaseHelper = new Database_Helper();
        Database_Helper.Crud crud = new Database_Helper.Crud();
        Product_Manager productManager = new Product_Manager();
        Product product = new Product();
        product.name = "Monster Notebook";
        product.price = 3000;
        productManager.add(product);
        crud.add();
    }
}

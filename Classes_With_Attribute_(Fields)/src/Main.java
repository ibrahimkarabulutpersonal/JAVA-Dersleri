public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.name = "Monster ABRA";
        product.description = "Gaming Notebook";
        product.stockAmount = 100;
        product.price = 599;
        Product_Manager productManager = new Product_Manager();
        productManager.add(product.name, product.description, product.stockAmount, product.price);
    }
}

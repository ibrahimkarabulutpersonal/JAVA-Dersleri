public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        Product_Manager productManager = new Product_Manager();

        product.setName("Monster ABRA");
        product.setDescription("Gaming Notebook");
        product.setStockAmount(100);
        product.setPrice(599);
        productManager.add(product);
    }
}

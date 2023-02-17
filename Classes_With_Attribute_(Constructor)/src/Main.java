public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        Product_Manager productManager = new Product_Manager();

        //Yeni Ürün Eklemek İçin Aşağıdaki Kod Bloğunu Tekrarlamalısın
        product.name = "Monster ABRA";
        product.description = "Gaming Notebook";
        product.stockAmount = 100;
        product.price = 599;
        productManager.add(product);
    }
}

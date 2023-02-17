public class Product_Manager {
    public void add(Product product){
        System.out.println("Ürün Adı: "+product.getName());
        System.out.println("Ürün Açıklaması: "+product.getDescription());
        System.out.println("Ürün Stoğu: "+product.getStockAmount());
        System.out.println("Ürün Fiyatı: "+product.getPrice());
    }
}

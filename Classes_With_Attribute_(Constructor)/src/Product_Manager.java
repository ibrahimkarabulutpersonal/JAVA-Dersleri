public class Product_Manager {
    public void add(Product product){
        System.out.println("Ürün Bilgileri\n***************");
        System.out.println("Ürün Adı: "+product.name);
        System.out.println("Ürün Açıklaması: "+product.description);
        System.out.println("Ürün Stoğu: "+product.stockAmount);
        System.out.println("Ürün Fiyatı: "+product.price);
        System.out.println("***  Ürün Eklendi  ***");
    }
}

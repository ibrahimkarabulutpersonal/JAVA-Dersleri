public class Product {
    public Product(){
        System.out.println("Product Class'ı Kullanıldı");
    }
    public Product(int id,String name,String description,int stockAmount,double price){
        System.out.println("Ürün Adı: "+name);
        System.out.println("Ürün Açıklaması: "+description);
        System.out.println("Ürün Stoğu: "+stockAmount);
        System.out.println("Ürün Fiyatı: "+price);
    }

}

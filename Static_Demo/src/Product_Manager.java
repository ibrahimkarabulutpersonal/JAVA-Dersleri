public class Product_Manager {
    public void add(Product product){
        Product_Validator productValidator = new Product_Validator();
        if(productValidator.isValid(product)){
            System.out.println("Ürün Doğrulandı Ve Database'e Gönderildi");
        }else{
            System.out.println("Ürün ile ilgili sorun çıktı kontrol edip tekrar deneyiniz");
        }
    }
}

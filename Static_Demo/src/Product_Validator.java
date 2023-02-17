public class Product_Validator {
    static{
        System.out.println("Static yapısı kullanıldı");
    }
    public boolean isValid(Product product){
        if(product.price>0 && !product.name.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
}

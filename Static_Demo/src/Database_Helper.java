public class Database_Helper {

    public static class Crud{
        public void add(){
            System.out.println("Ürün Eklendi");
        }
        public void update(){
            System.out.println("Ürün Güncellendi");
        }
        public void delete(){
            System.out.println("Ürün Silindi");
        }
    }
    public static class Connection{
        public static void createConnection(){
            System.out.println("Bağlantı Sağlandı");
        }
    }
}

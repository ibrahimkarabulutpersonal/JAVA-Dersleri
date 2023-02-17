public interface IPayable {
    public default void payWeekly(){
        System.out.println("Haftalık Ödeme Planına Dahil");
    }
    public default void payMonthly(){
        System.out.println("Aylık Ödeme Planına Dahil");
    }
    public default void payYearly(){
        System.out.println("Yıllık Ödeme Planına Dahil");
    }
}

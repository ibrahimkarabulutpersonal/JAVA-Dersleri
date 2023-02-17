public interface IEatable {
    public default void eatMorning(){
        System.out.println("Sabah Yemeğine Dahil");
    }
    public default void eatNoon(){
        System.out.println("Öğle Yemeğine Dahil");
    }
    public default void eatNight(){
        System.out.println("Akşam Yemeğine Dahil");
    }

}

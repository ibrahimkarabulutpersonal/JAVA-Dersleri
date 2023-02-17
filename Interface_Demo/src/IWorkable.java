public interface IWorkable {
    public default void workFirstPart(){
        System.out.println("00:00 İle 08:00 Arası Çalışma Planına Dahil");
    }
    public default void workSecondPart(){
        System.out.println("08:00 İle 16:00 Arası Çalışma Planına Dahil");
    }
    public default void workThirdPart(){
        System.out.println("16:00 İle 24:00 Arası Çalışma Planına Dahil");
    }
    public default void workFlexible(){
        System.out.println("Esnek Çalışma Planına Dahil");
    }
}

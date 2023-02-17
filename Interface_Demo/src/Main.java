public class Main {
    public static void main(String[] args){
        Outsource_Worker outsourceWorker = new Outsource_Worker();
        Remote_Worker remoteWorker = new Remote_Worker();
        Worker worker = new Worker();
        outsourceWorker.eatMorning();
        outsourceWorker.eatNoon();
        outsourceWorker.eatNight();
        outsourceWorker.eatNight();
        outsourceWorker.workFlexible();
    }
}

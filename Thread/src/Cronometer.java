public class Cronometer implements Runnable{
    Thread thread;
    String threadName;

    public Cronometer(String name){
        this.threadName = name;
    }

    @Override
    public void run(){
        for(byte i=0; i<10; i++){
            System.out.println("Kronometre zamanı: "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void start(){
        if(thread == null){
            thread = new Thread(this,threadName);
            thread.start();
        }
    }

}

public abstract class Game_Calculator {
    public abstract void calculate(byte kill, byte assist, byte death);
    public final void finish(){
        System.out.println("Match is over");
    }
}

public class Main {
    public static void main(String[] args){
        Game_Calculator kidsGame = new Kids_Game();
        Game_Calculator youngGame = new Young_Game();
        byte kill = 10;
        byte assist = 5;
        byte death = 8;

        kidsGame.calculate(kill, assist, death);
        kidsGame.finish();

        youngGame.calculate(kill, assist, death);
        youngGame.finish();
    }
}

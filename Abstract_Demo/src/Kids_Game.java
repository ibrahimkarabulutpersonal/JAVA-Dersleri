public class Kids_Game extends Game_Calculator{
    @Override
    public void calculate(byte kill, byte assist, byte death){
        double allKill = kill+assist;
        double result = allKill/death;
        System.out.println("Your KD: "+result);
    }

}

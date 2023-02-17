public class Main {
    public static void main(String[] args){
        Value_Control valueControl = new Value_Control();
        System.out.println(valueControl.control(5));
        System.out.println(gather(5,2));
        System.out.println(gatherBig(5,2,3,8,5,8,9,2));
        Method_Overloading methodOverloading = new Method_Overloading();
        System.out.println(methodOverloading.plus(5,2));
        System.out.println(methodOverloading.plus(5,2,89));
    }
    public static int gather(int x, int y){
        return x+y;
    }

    public static int gatherBig(int... number){
        int x = 0;
        for(int value:number){
            x+=value;
        }
        return  x;
    }
}

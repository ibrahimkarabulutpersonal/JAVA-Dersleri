public class Main {
    public static void main(String[] args){
        int[] value = {1,2,3,4,5,6,7,8,9};
        int input = 5;
        boolean control = false;
        for(int print:value){
            if (print == input) {
                control = true;
                break;
            }
        }
        System.out.println(control);
    }
}

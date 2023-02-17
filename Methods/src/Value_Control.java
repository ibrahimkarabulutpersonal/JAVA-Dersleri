public class Value_Control {
    public boolean control(int input){
        int[] value = {1,2,3,4,5,6,7,8,9};
        boolean isValid = false;
        for(int bastir:value) if(bastir == input) isValid = true;
        return isValid;
    }
}

package randomKata;

public class ReduceButGrow {
    public static int grow(int[] x){
        int result = 1;
        for(int i = 0; i < x.length; i++){
            result = result * x[i];
        }
        return result;
    }
}

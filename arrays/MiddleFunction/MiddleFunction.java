import java.util.Arrays;

public class MiddleFunction {
    public static void main(String[] args){
        MiddleFunction main = new MiddleFunction();
        int[] arr = {1, 2, 3};
        System.out.println(Arrays.toString(main.middle(arr)));
    }

    public int[] middle(int[] arr){
        if (arr.length <= 2){
            return Arrays.copyOf(arr, 0);
        }
        return Arrays.copyOfRange(arr, 1, arr.length-1);
    }
}

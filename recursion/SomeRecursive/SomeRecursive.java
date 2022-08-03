import java.util.Arrays;

public class SomeRecursive {
    public static void main(String[] args){
        SomeRecursive main = new SomeRecursive();
        OddFunction odd = new OddFunction();

        int[] arr = {2, 4};
        boolean result = main.someRecursive(arr, odd);
        System.out.println(result);
    }

    public boolean someRecursive(int[] arr, OddFunction odd){
        if (arr.length == 0)
            return false;
        if (odd.run(arr[0]) == false)
            return someRecursive(Arrays.copyOfRange(arr, 1, arr.length), odd);
        return true;
    }
}

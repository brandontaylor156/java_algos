import java.util.Arrays;
public class DuplicateNumber {
    public static void main(String[] args){
        DuplicateNumber main = new DuplicateNumber();
        int[] arr = {1, 1, 2, 2, 2, 3, 4, 5};
        System.out.println(Arrays.toString(main.removeDuplicates(arr)));
    }
    // Left and right pointers both at index 1, compare previous index to current
    // Place unique values in left pointer position, only update left pointer for unique values
    // Right pointer loops all the way through
    public int[] removeDuplicates(int[] arr){
        if(arr.length == 0 || arr.length == 1){
            return arr;
        }
        int leftPointer = 1;
        for (int i = 1; i < arr.length; i++){
            if (arr[i-1] != arr[i]){
                arr[leftPointer] = arr[i];
                leftPointer++;
            }
        }
        return Arrays.copyOfRange(arr, 0, leftPointer);
    }
}

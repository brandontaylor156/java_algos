public class ProductOfArray {
    public static void main(String[] args){
        ProductOfArray main = new ProductOfArray();

        int[] arr = {0};
        int result = main.productOfArray(arr, arr.length);
        System.out.println(result);
    }

    public int productOfArray(int[] arr, int length){
        if (length == 0)
            return 0;
        if (length == 1)
            return length;
        return arr[length-1] * productOfArray(arr, length-1);
    }
}

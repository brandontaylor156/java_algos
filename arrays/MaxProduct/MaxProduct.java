public class MaxProduct {
    public static void main(String[] args){
        MaxProduct main = new MaxProduct();
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(main.maxProduct(arr));
    }

    public int maxProduct(int[] arr){
        int max = 0;
        for (int i = 0; i < arr.length; i++){
            for (int j = i+1; j < arr.length; j++){
                if (arr[i] * arr[j] > max){
                    max = arr[i] * arr[j];
                }
            }
        }
        return max;
    }
}

public class IntPermutation{
    public static void main(String[] args){
        IntPermutation main = new IntPermutation();
        int[] arr1 = {1, 4, 3, 4, 5};
        int[] arr2 = {5, 4, 3, 4, 1};
        System.out.println(main.intPermutation(arr1, arr2));
    }

    public boolean intPermutation(int[] arr1, int[] arr2){
        if (arr1.length !=  arr2.length)
            return false;

        int sum1 = 0, sum2 = 0;
        int product1 = 0, product2 = 0;
        for (int i = 0; i < arr1.length; i++){
            sum1 += arr1[i];
            product1 *= arr1[i];

            sum2 += arr2[i];
            product2 *= arr2[i];
        }
        if (sum1 == sum2 && product1 == product2)
            return true;
        return false;
    }
}
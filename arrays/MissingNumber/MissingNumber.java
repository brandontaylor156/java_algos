public class MissingNumber{
    public static void main(String[] args){
        MissingNumber main = new MissingNumber();
        int intArray[] = {1, 2, 3, 4, 5, 6, 8, 9, 10};
        System.out.println(main.missingNumber(intArray));
    }

    public int missingNumber(int[] arr){
        int sum1 = 0, sum2 = 0;
        for (int i = 0; i < arr.length; i++){
            sum1 += arr[i];
        }

        // (n)(n + 1)/2 for sum of numbers from 1 to n
        sum2 = (10 * 11) / 2;

        return sum2 - sum1;
    }
}
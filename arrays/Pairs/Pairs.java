public class Pairs {
    public static void main(String[] args){
        Pairs main = new Pairs();
        int[] arr = {2, 4, 3, 5, 6, -2, 4, 7, 8, 9};
        int sum = 7;
        System.out.println(main.pairSum(arr, sum));
    }

    public String pairSum(int[] arr, int sum){
        String newString = "";
        for (int i= 0; i < arr.length; i++){
            for (int j = i+1; j < arr.length; j++){
                if (arr[i] + arr[j] == sum){
                    newString += arr[i] + ":" + arr[j] + " ";
                }
            }
        }
        return newString;
    }
}

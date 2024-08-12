import java.util.Arrays;
import java.util.Collections;

public class BestScore {
    public static void main(String[] args){
        BestScore main = new BestScore();
        Integer[] arr = {84,85,86,87,85,90,85,83,23,45,84,1,2,0};
        System.out.println(main.firstSecond(arr));
        System.out.println(main.firstSecondEnhanced(arr));
    }

    // O(N^2) VERSION
    public String firstSecond(Integer[] arr){
        if (arr.length < 2)
            return "Must have at least 2 scores, Buddy";

        int maxSum = 0;
        int score1 = 0, score2 = 0;
        for (int i = 0; i < arr.length; i++){
            for (int j = i+1; j < arr.length; j++){
                if (arr[i]+arr[j] > maxSum){
                    maxSum = arr[i] + arr[j];
                    score1 = arr[i];
                    score2 = arr[j];
                }
            }  
        }
        return Integer.toString(score1) + " " + Integer.toString(score2);
    }

    // O(1) VERSION
    public String firstSecondEnhanced(Integer[] arr){
        Arrays.sort(arr, Collections.reverseOrder());
        int first = arr[0];
        int second = arr[1];
        return first+ " "+second;
    }
}

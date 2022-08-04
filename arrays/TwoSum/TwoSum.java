import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args){
        TwoSum main = new TwoSum();
        int[] nums = {2, 11, 10, 15, 8};
        int target = 9;

        System.out.println(Arrays.toString(main.twoSum(nums, target)));
    }

    public int[] twoSum(int[] nums, int target){
        int[] newArr = {-1,-1};
        for (int i = 0; i < nums.length; i++){
            for (int j = i+1; j < nums.length; j++){
                if (nums[i] + nums[j] == target){
                    newArr[0] = i;
                    newArr[1] = j;
                }
            }
        }
        return newArr;
    }
}

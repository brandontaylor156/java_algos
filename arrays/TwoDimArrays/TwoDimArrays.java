public class TwoDimArrays {
    public static void main(String[] args){
        TwoDimArrays main = new TwoDimArrays();
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};

        System.out.println(main.sumDiagonal(arr));
    }

    public int sumDiagonal(int[][] arr){
        if (arr.length != arr[0].length){
            return -1;
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum+= arr[i][i];
        }
        return sum;
    }
}

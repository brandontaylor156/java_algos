import java.util.Arrays;

public class RotateMatrix{

    public static void main(String[] args){
        RotateMatrix main = new RotateMatrix();
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12}, {13,14,15,16}};
        System.out.println(Arrays.deepToString(main.rotateMatrix(matrix)));
    }

    public int[][] rotateMatrix(int[][] matrix){
        int left, right, top, bottom; 
        left = top = 0;
        right = bottom = matrix.length-1;
        
        int offset = 0;

        while(left < right){
            offset = 0;
            while (offset < right - left){
                int temp = matrix[top][left+offset];

                matrix[top][left+offset] = matrix[bottom-offset][left];
                matrix[bottom-offset][left] = matrix[bottom][right-offset];
                matrix[bottom][right-offset] = matrix[top+offset][right];
                matrix[top+offset][right] = temp;

                offset++;
            }
            left++;
            right--;
            bottom--;
            top++;
        }

        return matrix;
    }
}
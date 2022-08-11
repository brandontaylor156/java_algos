import java.util.Arrays;

public class RotateMatrix{

    public static void main(String[] args){
        RotateMatrix main = new RotateMatrix();
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.deepToString(main.rotateMatrix(matrix)));
    }

    public int[][] rotateMatrix(int[][] matrix){
        // Set pointer on all four corners
        int left, right, top, bottom; 
        left = top = 0;
        right = bottom = matrix.length-1;
        
        // Offset for an individual layer's rotation
        int offset = 0;

        // Nested for loop, outer loop closes in corner pointers by 1 
        // Inner loop for all rotations of given layer
        while(left < right){
            offset = 0;
            // This while condition ensures the correct number of rotations for a given layer
            // An NxN matrix would N-1 rotations! NOT N
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
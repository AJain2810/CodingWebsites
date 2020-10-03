import java.util.*;

public class SpiralMatrix {
    public static void main(String[] args) {
        // put your code here
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [][] matrix = new int[n][n];

        for(int[] vector: matrix){
            vector = new int[n];
        }
        int left = 0;
        int right = n-1;
        int top = 0;
        int bottom = n-1;
        
        int counter = 1;
        while( ( bottom >= top ) && ( right >= left ))
        {
            for (int j = left; j <= right; j++) {
                matrix[top][j] = counter;
                counter++;
            }
            top++;
            
            for (int j = top; j <= bottom; j++) {
                matrix[j][bottom] = counter;
                counter++;
            }
            right--;
            
            for (int j = right; j >= left; j--) {
               matrix[bottom][j] = counter;
               counter++;
            }
            bottom--;
            
            for (int j = bottom; j >= top; j--) {
                matrix[j][left] = counter;
                counter++;
            }
            left++;
            
        }
        
        for (int[] vector : matrix) {
            System.out.println(Arrays.toString(vector));
        }
        
    }
}


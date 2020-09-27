import java.util.*;

class Result {

    /*
     * Complete the 'rotateLeft' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER d
     *  2. INTEGER_ARRAY arr
     */

    // Problem URL: https://www.hackerrank.com/challenges/array-left-rotation/problem

    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
    // Write your code here
    int n = arr.size();

    Integer []new_arr = new Integer[n];

    for(int i=d;i<n;i++){
        new_arr[i-d] = arr.get(i);
    }
    for(int i = n - d; i < n; i++)
    {
        new_arr[i] = arr.get(i-n+d);
    }
    return Arrays.asList(new_arr);

    }

}
public class left_rotation {
    
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import com.sun.org.apache.xalan.internal.xsltc.util.IntegerArray;

public class Max_Abs_Diff_Sum{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int size;
        size = sc.nextInt();
        Integer arr[] = new IntegerArray(size);
        for (int i = 0; i < size; i++) {
            arr[i] = new Integer(sc.nextInt());
        }

        MaxSumDifferencec(arr, size);
    }

    public static int MaxSumDifference(Integer arr[], int size) {
        List<Integer> newSequence = new ArrayList<Integer>();

        Arrays.sort(arr);
        
        for (int i = 0; i < n/2; i++) {
            newSequence.add(arr[i]);
            newSequence.add(arr[size-i-1]);
        }

        int max_sum = 0;
        for (int i = 0; i < size-1; i++) {
            max_sum += Math.abs(newSequence.get(i) - newSequence.get(i+1));
        }
        max_sum += Math.abs(newSequence.get(size-1) - newSequence.get(0));
        return max_sum;
    }
}

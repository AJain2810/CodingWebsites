import java.util.Arrays;
import java.util.Scanner;

public class Minimum_Absolute_Difference{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++)
            arr[i] = sc.nextInt();
        Arrays.sort(arr);
        
        int min = arr[size-1]-arr[0];
        for(int i=0;i<size-1;i++)
        {
            int temp = arr[i+1] - arr[i];
            if(temp<min)
                min = temp;
        }
        System.out.println(min);
    }
}
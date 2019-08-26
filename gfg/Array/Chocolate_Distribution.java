import java.util.Arrays;
import java.util.Scanner;

public class Chocolate_Distribution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int j=0;j<test;j++)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<n;i++)
                arr[i] = sc.nextInt();
            int m = sc.nextInt();
            Arrays.sort(arr);

            int min = Integer.MAX_VALUE;
            for(int i=0;i+m-1 < n;i++)
            {
                int diff = arr[i+m-1] - arr[i];
                if(diff<min)
                    min = diff;
            }
            System.out.println(min);
        }
    }
}
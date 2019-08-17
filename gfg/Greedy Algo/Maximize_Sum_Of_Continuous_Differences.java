import java.util.Scanner;

public class Maximize_Sum_Of_Continuous_Differences{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        for(int i=0;i<n/2;i++)
        {
            sum -= (2*arr[i]);
            sum += (2*arr[n-i-1]);
        }
        
        System.out.println(sum);
    }
}
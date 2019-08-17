import java.util.Scanner;

public class Largest_Contiguous_Sum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }

        int max_so_far = 0;
        int max_ending_here = 0;
        for(int i=0;i<size;i++)
        {
            max_ending_here = max_ending_here + arr[i];
            if(max_ending_here<0)
                max_ending_here = 0;
            if(max_ending_here> max_so_far)
                max_so_far = max_ending_here;
        }
        System.out.println(max_so_far);
        
    }
}
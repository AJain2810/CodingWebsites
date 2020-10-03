import java.util.Scanner;

public class Largest_Subarray_GCD_One{
    public static int GCD(int a, int b) { return b==0 ? a : GCD(b, a%b); }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        size = sc.nextInt();
        int arr[] = new int[size];
        
        for(int i=0;i<size;i++)
            arr[i] = sc.nextInt();
        
        int gcd = arr[0];
        for(int i=1;i<size;i++)
        {
            gcd = GCD(gcd, arr[i]);
        }
        
        int res = (gcd==1)?size : -1;
        System.out.println(res);
    }
}
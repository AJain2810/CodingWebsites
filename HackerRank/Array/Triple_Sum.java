import java.util.Arrays;
import java.util.Scanner;

public class Triple_Sum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size1, size2, size3;
        size1 = sc.nextInt();
        size2 = sc.nextInt();
        size3 = sc.nextInt();
        int arr_1[] = new int[size1];
        int arr_2[] = new int[size2];
        int arr_3[] = new int[size3];
        //Arrays.sort(a);

        for(int i=0;i<size1;i++)
            arr_1[i] = sc.nextInt();
        for(int i=0;i<size2;i++)
            arr_2[i] = sc.nextInt();
        for(int i=0;i<size3;i++)
            arr_3[i] = sc.nextInt();

        System.out.println(triplets(arr_1, arr_2, arr_3));
    }  
    public static long triplets(int[] a, int[] b, int[] c) {

        Arrays.sort(a);
        Arrays.sort(b);
        Arrays.sort(c);
        
        long count = 0;
        int temp = 0;
        int temp2 = 0;
        for (int i = 0; i < b.length; i++) {
            if (i>0 && b[i]==b[i-1])
                continue;
            //int temp = 0;
            //int j=0;
            //int temp2 = 0;
            for(int j=temp;j<a.length;j++)
            {
                if(j>0 && a[j]==a[j-1])
                    continue;
                if(a[j]<=b[i])
                    temp++;
                    
            }
            //j=0;
            for(int j=temp2;j<c.length;j++)
            {
                if(j>0 && c[j]==c[j-1])
                    continue;
                if(c[j]<=b[i])
                    temp2++;
                    
            }
            System.out.println(temp);
            System.out.println(temp2);
            long res = (long)(temp) * (temp2);
            count += res;
        }
        return count;
    }
 
public static long triplets_revamp(int[] a, int[] b, int[] c) {

    Arrays.sort(a);
    Arrays.sort(b);
    Arrays.sort(c);
    
    int ai = 0;
    int bi = 0;
    int ci = 0;
    long ans = 0;

    while(bi< b.length)
    {
        while(ai<a.length && a[ai]<=b[bi])
            ai += 1 ;
        while(ci < c.length && c[ci] <= b[bi])
            ci += 1;
        ans += (long)ai* (long)ci;
        bi += 1;
    }
    return ans;
    
      
    return count;
}

}
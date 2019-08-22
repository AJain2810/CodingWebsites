import java.util.ArrayList;
import java.util.Scanner;

public class Loops_Two{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int test;
        test = sc.nextInt();

        for(int i=0;i<test;i++)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            String res_final = "";
            for(int j=0;j<n;j++)
            {
                int temp = powerOfTwo(j, b);
                int res = a + temp;
                res_final = res_final + res +" ";
            }
            System.out.println(res_final);

        }
    }

    public static int powerOfTwo(int count, int b)
    {
        int res = 0;
        for(int i=0;i<=count;i++)
        {
            res += (Math.pow(2, i)*b);
        }
        return res;
    }
}





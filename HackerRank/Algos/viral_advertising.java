import java.io.*;
import java.util.*;
import java.math.*;

public class ViralAdvertising{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int days;
        days=sc.nextInt();
        int sum=0;
        int prev=5;
        int likes=0;
        while(days>0)
        {
            likes=Integer.parseInt(Math.floor(prev/2));
            prev=likes*3;
            sum+=likes;
        }
        System.out.println(sum+"");
        
    }
    
}
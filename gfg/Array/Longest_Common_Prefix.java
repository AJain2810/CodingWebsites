/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

public class Longest_Common_Prefix

{
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)
            return "-1";
        
        int minLen = Integer.MAX_VALUE;
        for (String str : strs)
            minLen = Math.min(minLen, str.length());
        int low = 1;
        int high = minLen;
        while (low <= high) {
            int middle = (low + high) / 2;
            if (isCommonPrefix(strs, middle))
                low = middle + 1;
            else
                high = middle - 1;
        }
        if(strs[0].substring(0, (low + high) / 2).length()==0)
            return "-1";
        return strs[0].substring(0, (low + high) / 2);
    }
    
    private static boolean isCommonPrefix(String[] strs, int len){
        String str1 = strs[0].substring(0,len);
        for (int i = 1; i < strs.length; i++)
            if (!strs[i].startsWith(str1))
                return false;
        return true;
    }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int j=0;j<test;j++)
        {
            int n = sc.nextInt();
            String arr[] = new String[n];
            for(int i=0;i<n;i++)
                arr[i] = sc.next();
            String res = longestCommonPrefix(arr);
            System.out.println(res);
            
        }
        
        
        
    }
}
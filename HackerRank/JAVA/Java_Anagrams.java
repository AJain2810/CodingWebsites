import java.util.*;

public class Java_Anagram {

    static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        
        char[] a = s1.toLowerCase().toCharArray();
        char[] b = s2.toLowerCase().toCharArray();
        boolean anagram = true;
        Arrays.sort(a);
        Arrays.sort(b);
        

        for(int i = 0; i < a.length; i++) {
            if(a[i] != b[i]) {
                anagram = false;
            }
        }
        /*
        OR:
            Arrays.sort(a);
            Arrays.sort(b);
            return Arrays.equals(a, b);
    
        */
        return anagram;
    }
}

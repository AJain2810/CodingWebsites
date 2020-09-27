// Problem URL: https://www.hackerrank.com/challenges/sparse-arrays/problem

class Solution {

    // Complete the matchingStrings function below.
    static int[] matchingStrings(String[] strings, String[] queries) {
        int res[] = new int[queries.length];
        int inde = 0;
        for (String query : queries){
            for( String word : strings){
                if (word.equals(query))
                {
                    res[inde]++;
                }
            }
            inde++;
        }
        return res;
    }
}
class sparse_array {
    
}

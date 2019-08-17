import java.util.ArrayList;
import java.util.HashSet;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.List;
import java.util.Set;

public class Climbing_The_Leaderboard{
    private static final Scanner scanner = new Scanner(System.in);

    /*public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int scoresCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] scores = new int[scoresCount];

        String[] scoresItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < scoresCount; i++) {
            int scoresItem = Integer.parseInt(scoresItems[i]);
            scores[i] = scoresItem;
        }

        int aliceCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] alice = new int[aliceCount];

        String[] aliceItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < aliceCount; i++) {
            int aliceItem = Integer.parseInt(aliceItems[i]);
            alice[i] = aliceItem;
        }

        int[] result = climbingLeaderboard(scores, alice);

        /*
        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();
        */
       /*
        scanner.close();
    }
    
    */
    public static int[] climbingLeaderboard(int[] scores, int[] alice) {
        Set<Integer> scoores = new HashSet<Integer>();
        for(int i=0;i<scores.length; i++)
        {
            scoores.add(new Integer(scores[i]));            
        }

        int res[] = new int[alice.length];
        //System.out.println(scoores.toString());
        for(int i=0;i<res.length;i++)
        {
            scoores.add(alice[i]);
            //System.out.println(scoores);
            List<Integer> temp_list = new ArrayList<>(scoores);
            Collections.sort(temp_list);
            System.out.println(temp_list);
            int index = temp_list.indexOf(alice[i]);
            res[i] = scoores.size() - index;
            System.out.println(index);
        }
        for(int i=0;i<res.length;i++)
            System.out.println(res[i]);
        return res;
    }
}
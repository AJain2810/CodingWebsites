import java.util.*;

public class Java_1D_Array {

    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
        int index = 0;
        return canWin(leap, game, index);
    }

    public static boolean canWin(int leap, int[] game, int index)
    {
        if(index>game.length-1)
            return true;
        if(index<0)
            return false;
        if(game[index]!=0)
            return false;
        
        if (index+leap>game.length) 
            return true;
        game[index]=1;

        return canWin(leap, game, index+leap) || canWin(leap, game, index+1) || canWin(leap, game, index-1);

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}


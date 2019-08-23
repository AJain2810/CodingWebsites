import java.util.Scanner;

public class Save_The_Prisoner{

    public static int saveThePrisoner(int n, int m, int s)
    {
        res = (m + s - 1) % n;
        return res==0 ? n : res;
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String []inpt = sc.nextLine().split(" ");
    int n = Integer.parseInt(inpt[0]);
    int m = Integer.parseInt(inpt[1]);
    int s = Integer.parseInt(inpt[2]);

    int result = saveThePrisoner(n, m, s);
    }
}
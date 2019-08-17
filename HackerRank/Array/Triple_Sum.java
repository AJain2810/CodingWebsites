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
        
        for(int i=0;i<size1;i++)
            arr_1[i] = sc.nextInt();
        for(int i=0;i<size2;i++)
            arr_2[i] = sc.nextInt();
        for(int i=0;i<size3;i++)
            arr_3[i] = sc.nextInt();
        Arrays.sort(arr_1);
        Arrays.sort(arr_2);
        Arrays.sort(arr_3);
        
    }   
}
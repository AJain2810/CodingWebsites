import java.util.Arrays;

public class SubArray_Partition{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        
        Arrays.sort(arr);

        int arr_n[] = new int[k];
        int j=0;
        for(int i = size-1; i > (size-k-1); i--)
        {
            arr_n[j] = arr[i];
            j++;
        }

        int arr_nk[] = new int[size-k];
        for(int i=0 ; i<size-k; i++)
        {
            arr_nk[i] = arr[i];
        }
        
    }
}
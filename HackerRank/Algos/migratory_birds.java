import java.util.Scanner;

class migratory_birds{

    private static int[] countResults(int arr[])
    {
        int res[] = new int[5];
        for(int i=0;i<arr.length;i++)
            {
                int val=arr[i];
                res[--val]+=1;
            }
        return res;

    }

    private static int extractMax(int arr[])
    {
        int count=0;
        int index=0;
        for(int i=0;i<5;i++)
        {
            if (arr[i]>count)
                {
                    index=i;
                    count = arr[i];
                }
        }
        return index;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int arr[] = new int[len];
        for(int i=0;i<len;i++)
            arr[i] = sc.nextInt();
        
        int res_arr[] = countResults(arr);
        int res = extractMax(res_arr);
        System.out.println(res);
        sc.close();
    }
}
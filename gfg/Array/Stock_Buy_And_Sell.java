import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Stock_Buy_And_Sell{


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int j=0;j<test;j++)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int count = 0;
            int i=0;
            ArrayList<StockInterval> res = new ArrayList<StockInterval>();
            while(i<arr.length-1)
            {
                int start = 0;
                int end = 0;
                while(i < n-1 && arr[i] >= arr[i+1])
                    i++;
                if(i==n-1)
                    break;
                start = i;
                i += 1;
                while(i < n && arr[i] >= arr[i-1])
                    i += 1;
                end = i - 1;
                StockInterval obj = new StockInterval();
                obj.buy_date = start;
                obj.sell_date = end;
                //System.out.println(i);
                res.add(obj);
            }

            if(res.size()==0)
                System.out.println("No profit");
            else{
                for (int k = 0; k < res.size(); k++) {
                    String r = "(" + res.get(k).buy_date +", " + res.get(k).sell_date +")";
                    System.out.println(r);
                }
            }
        }
    }
}

class StockInterval{
    public int buy_date;
    public int sell_date;

}
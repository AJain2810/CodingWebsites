#include<iostream>
using namespace std;
int main()
{
    int test;
    cin>>test;
    for(int i=0;i<test;i++)
    {
        int n;
        cin>>n;
        int arr[n];
        for (int j=0;j<n;j++)
        {
            cin>>arr[j];
            /* code */
        }

        int max_right = 0;
        int max_left = 0;
        int lo = 0;
        int hi = n-1;
        int res = 0;
        while(lo<=hi)
        {
            if(arr[lo]<arr[hi])
            {
                if(arr[lo]> max_left)
                    max_left = arr[lo];
                else{
                    res += max_left - arr[lo];
                    lo++;
                }
            }

            else{
                if(arr[hi] > max_right)
                    max_right = arr[hi];
                else{
                    res += max_right - arr[hi];
                    hi--;
                }
            }
        }

        cout<<res<<endl;
        
    }
}
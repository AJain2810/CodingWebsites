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
        cout<<"Array made";
        for(int i=0;i<n;i++)
            arr[i]=0;
        for(int i=1;i<=n;i++)
        {
            for(int j=i;i<=n;j+=i)
            {
                cout<<j<<" "<<i;
                if (arr[j-1]==1)
                    arr[j-1]=0;
                else
                {
                    arr[j-1]=1;
                }
                
            }
        }

        int count=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==0)
                count++;
        }
    }
}
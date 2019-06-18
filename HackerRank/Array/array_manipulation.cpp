#include<iostream>
using namespace std;
int main()
{
    int size, no;
    cin>>size>>no;
    int arr[size];
    for(int i=0;i<size;i++)
        arr[i]=0;
    for(int i=0;i<no;i++)
    {
        int m,n,op;
        cin>>m>>n>>op;
        m--;
        n--;

        for(int j=m;j<=n;j++)
        {
            arr[j]+=op;
        }
    }

}
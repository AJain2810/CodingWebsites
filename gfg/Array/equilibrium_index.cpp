#include<iostream>
using namespace std;

int equil_index(int [], int);
int main()
{
    int size;
    cin>>size;
    int arr[size];
    for(int i=0;i<size;i++)
        cin>>arr[i];
    int res = equil_index(arr, size);
    if(res>0)
        cout<<"\nEquil index is:"<<res;
    else
    {
        cout<<"No such index exists";
    }
    cout<<"\n";
    
}

int equil_index(int arr[], int size)
{
    int sum=0;
    for(int i=0;i<size;i++)
        sum+=arr[i];
    int res=-1;
    int left_sum = 0;
    for(int i=0;i<sum;i++)
    {
        left_sum += arr[i];
        sum = sum - arr[i];

        if(sum==left_sum)
            res = i;
    }
    return res;
}
#include<iostream>
using namespace std;

int main()
{
    int size;
    cin>>size;
    int k;
    cin>>k;
    int arr[size];
    for(int i=0;i<size;i++)
        cin>>arr[i];
    
    int max = 1;
    int curr_prod = 1;
    for(int i=0;i<k;i++)
        curr_prod *= arr[i];
    
    max = curr_prod;
    for(int i=k;i<size;i++)
    {
        curr_prod *= arr[k];
        curr_prod /= arr[k-k];
        
        if( curr_prod >= max)
            max = curr_prod;
    }
    cout<<endl<<max;
}

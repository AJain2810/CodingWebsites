#include<iostream>
using namespace std;

int main()
{
    int n,k,q;
    int arr[n];
    for(int i=0;i<n;i++)
        cin>>arr[i];
    int arr_2[n];
    for(int i=0;i<n;i++)
        arr_2[i] = arr[(i+k)%n];
    
    delete[] arr;
    for(int i=0;i<q;i++)
    {
        int index;
        cin>>index;
        cout<<arr_2[index];
    }
}
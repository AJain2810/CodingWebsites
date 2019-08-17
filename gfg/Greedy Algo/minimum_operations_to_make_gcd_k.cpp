// GFG:
// Minimum Operations to Make GCD of array a multiple of k
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
    int operatios = 0;
    for(int i=0;i<size;i++)
    {
        int temp = arr[i]%k;
        operatios += min(temp, k-temp);
    }

    cout<<operatios;
}
#include<iostream>
using namespace std;

int main()
{
    int budget, num_key, num_usb;
    cin>>budget>>num_key>>num_usb;
    int arr_key[num_key];
    for(int i=0;i<num_key;i++)
    {
        cin>>arr_key[i];
    }

    int arr_usb[num_usb];
    for(int i=0;i<num_usb;i++)
    {
        cin>>arr_usb[i];
    }
    int max=-1;
    for(int i=0;i<num_key;i++)
    {
        for(int j=0;j<num_usb;j++)
        {
            int temp = arr_usb[j] + arr_key[i];
            if (temp>=max && temp<=budget)
                max = temp;
        }
    }
    cout<<endl<<max;
}
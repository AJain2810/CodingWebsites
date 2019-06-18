#include <iostream>
using namespace std;

int main() {
	//code
	int test;
	cin>>test;
	for(int i=0;i<test;i++)
	{
	    int size;
	    cin>>size;
	    int arr[size];
	    for(int j=0;j<size;j++)
	    {
	        cin>>arr[j];
	    }
	    
	    int k;
	    cin>>k;
	    int res[size];
	    for(int j=0;j<size;j++)
	    {
	        res[j]=arr[(j+k)%size];
	    }
	    
	    for(int j=0;j<size;j++)
	        cout<<res[j]<<" ";
	        
        cout<<endl;
	}
	return 0;
}
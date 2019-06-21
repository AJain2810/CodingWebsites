#include<iostream>
using namespace std;

#include <bits/stdc++.h> 
using namespace std; 
  
/* Returns 1 if y is a power of x */
bool isPower(int x, long int y) 
{ 
    // The only power of 1 is 1 itself 
    if (x == 1) 
        return (y == 1); 
  
    // Repeatedly comput power of x 
    long int pow = 1; 
    while (pow < y) 
        pow *= x; 
  
    // Check if power of x becomes y 
    return (pow == y); 
} 


int main()
{
    int test;
    cin>>test;
    for(int i=0;i<test;i++)
    {
        int a;  
        long int b;
        cin>>a>>b;
        bool stats=isPower(a,b);
        if(stats)
            cout<<"1"<<endl;
        else
        {
            cout<<"0"<<endl;
        }
        
    }
}
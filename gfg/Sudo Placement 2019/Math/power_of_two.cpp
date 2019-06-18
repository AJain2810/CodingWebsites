#include<iostream>
#include<bits/stdc++.h> 
using namespace std; 
  

bool checkNum(int n) 
{ 
   if(n==0) 
   return false; 
   return (ceil(log2(n)) == floor(log2(n))); 
} 

int main() 
{
    int test;
    cin>>test;
    for(int i=0;i<test;i++)
    {
        int num;
        cin>>num;
        checkNum(num)? cout<<"YES"<<endl: cout<<"NO"<<endl;
    }
    return 0; 
} 
  
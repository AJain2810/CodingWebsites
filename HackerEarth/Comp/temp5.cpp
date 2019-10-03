
#include <bits/stdc++.h> 
using namespace std; 
  
// Comparator to sort array in descending order 
bool compare(int a, int b) 
{ 
    return a > b; 
} 
  
// Function to find the size of the smallest 
// subset with the maximum value of Bitwise OR 
int findMaxOR(int arr[], int n) 
{ 
    // sort the array in decreasing 
    // order 
    sort(arr, arr + n, compare); 
  
    // Maximum element in the set 
    int maxOR = arr[0]; 
  
    int count = 1; 
  
    for (int i = 1; i < n; i++) { 
        // if bitwise or with the next element is 
        // greater than current value 
        if ((maxOR | arr[i]) > maxOR) 
        // then add this element in the set and 
        // update the current maxOR value 
        { 
            maxOR = maxOR | arr[i]; 
            count++; 
        } 
    } 
  
    return count; 
} 
  
// Driver Code 
int main() 
{ 
    int test;
    cin>>test;
    for(int i=0;i<test;i++)
    {
        int size;
        cin>>size;
        int arr[size];
        for(int i=0;i<size;i++)
            cin>>arr[i];
        cout<<findMaxOR(arr, size);
    }
    //int arr[] = { 5, 1, 3, 4, 2 }; 
    //int n = sizeof(arr) / sizeof(arr[0]); 
  
    //cout << findMaxOR(arr, n); 
  
    return 0; 
} 
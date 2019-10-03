
// C++ program to find the size of the smallest 
// subset with the maximum value of Bitwise OR 
  
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
    ios::sync_with_stdio(0);
    cin.tie(0);

    int t;
    cin>>t;

    while(t--)
    {
        int a_i,n;
        cin >> n;
        int arr[n];
        for(int i=0;i<n;i++)
            cin>>arr[i];

  
        cout << findMaxOR(arr, n); 
    }
    return 0; 
} 
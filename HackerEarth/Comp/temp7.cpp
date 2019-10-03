#include <bits/stdc++.h> 
using namespace std; 
  
// function to find the maximum subset with 
// bitwise OR equal to k 
int subsetBitwiseORk(int arr[], int n, int k) 
{ 
    vector<int> v; 
  
    for (int i = 0; i < n; i++) { 
  
        // If the bitwise OR of k and element 
        // is equal to k, then include that element 
        // in the subset 
        if ((arr[i] | k) == k) 
            v.push_back(arr[i]); 
    } 
  
    // Store the bitwise OR of elements in v 
    int ans = 0; 
    int i=0;
    for (i = 0; i < v.size(); i++) 
        {
            ans |= v[i]; 
            if(ans==k)
                break;
        }
    if(i==v.size())
    {
        return v.size();
    }
    else{
        return i+1;
    }
  
    // If ans is not equal to k, subset doesn't exist 
    //if (ans != k) { 
    //    cout << "Subset does not exist" << endl; 
    //    return; 
    //} 
  
    //for (int i = 0; i < v.size(); i++) 
    //    cout << v[i] << ' '; 
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
        int k=0;
        for(int i=0;i<n;i++)
        {
            int temp ;
            cin>>temp;
            k = k | temp;
            arr[i] = temp;
        }
  
    cout<<subsetBitwiseORk(arr, n, k); 
    return 0; 
} 
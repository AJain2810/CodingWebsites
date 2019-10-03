#include<bits/stdc++.h>
using namespace std;

int get_minimum(int n, vector<int> A)
{
    int maxOR = 0;
    for(int i=0;i<A.size();++i)
    {
        maxOR = maxOR | A[i];
    }

    std :: sort(A.begin(), A.end());

    int temp = A[A.size() - 1];
    int count = 1;

    for(int i = A.size() - 2; i>-1 ; --i)
    {
        if(temp | A[i] == maxOR)
        {
            return count + 1;
        }

        else if(temp | A[i]>temp)
        {
            temp = temp | A[i];
            ++count;
        }
    }
}

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
        vector<int> A;
        for(int i_A=0; i_A<n; i_A++)
        {
       cin >> a_i;
       A.push_back(a_i);
        }

        int out_;
        out_ = get_minimum(n,A);
        cout << out_<<"\n";
    }
}
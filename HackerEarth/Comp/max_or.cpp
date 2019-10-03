#include <bits/stdc++.h>
using namespace std;
int main(void){
    int T;
    cin >>T;
    while(T--){
        int n;
        cin >> n;
        vector<int> v1(n);
        for (int i=0;i<n;i++){
            cin >>v1[i];
        }
        int x = 0;
        int count=0;
        for(int i=0;i<pow(2,n);i++){
            int temp_count=0;
            int temp = 0;

            for(int j=0;j<n;j++){
                if (i & 1<<j){
                    temp = temp | v1[i];
                    temp_count++;
                }
            }
            if (temp>x){
                x = temp;
                count = temp_count;
            }
        }
        cout<<count<<endl;
    }
}
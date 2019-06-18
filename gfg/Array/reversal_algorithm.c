#include<stdio.h>

void reverse_array(int arr[], int start, int end);
void leftRotate(int [], int , int ) ;

int main()
{
    int size;
    scanf("%d", &size);
    printf("%d\n", size);
    int arr[size];
    for(int i=0;i<size;i++)
    {
        scanf("%d", &arr[i]);
    }

    int d=4;
    leftRotate(arr, d, size);
    for(int i=0;i<size;i++)
    {
        printf("%d\t", arr[i]);
    }
}
void leftRotate(int arr[], int d, int n) 
{ 
    reverse_array(arr, 0, d-1); 
    reverse_array(arr, d, n-1); 
    reverse_array(arr, 0, n-1); 
}

void reverse_array(int arr[], int start, int end){
    while(start>end)
    {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
    }
}
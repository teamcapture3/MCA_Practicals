#include<iostream>
using namespace std;
void bubblesort(int arr[],int n)
{
    int i,j,k,xchanges,temp;
    for(i=0;i<n-1;i++)
    {
        xchanges=0;
        for(j=0;j<n-1-i;j++)
        {
            if(arr[j]>arr[j+1])
            {
                temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                xchanges++;
            }
        }
        if(xchanges==0)
            break;
        cout<<"\nAfter Pass "<<i+1<<" element are:\n";
        for(k=0;k<n;k++)
            cout<<arr[k]<<endl;
            cout<<endl;
    }
}
void printArray(int arr[],int size)
{
    int i;
    for(i=0;i<size;i++)
    cout<<arr[i]<<endl;
    cout<<endl;
}
int main()
{
    int arr[] = {23,15,29,11,1};
    int n = sizeof(arr)/sizeof(arr[0]);
    bubblesort(arr, n);
    cout<<"Sorted array: \n";
    printArray(arr,n);
    return 0;
}

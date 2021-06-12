#include<iostream>
#include<conio.h>
#include <malloc.h>
using namespace std;
void Merge(int *A,int *L,int Leftcount,int *R,int Rightcount)
{
    int i,j,k;
    i=0;j=0;k=0;
    while(i<Leftcount && j<Rightcount)
    {
        if(L[i]<R[j])A[k++]=L[i++];
        else A[k++]=R[j++];
    }
    while(i<Leftcount)
        A[k++]=L[i++];
    while(j<Rightcount)
        A[k++]=R[j++];
}
void MergeSort(int *A,int n)
{
    int mid,i,*L,*R;
    if(n<2) return;
    mid=n/2;
    L=(int *)malloc(mid*sizeof(int));
    R=(int *)malloc((n-mid)*sizeof(int));

    for(i=0;i<mid;i++)
    L[i]=A[i];
    for(i=mid;i<n;i++)
    R[i-mid]=A[i];

    MergeSort(L,mid);
    MergeSort(R,n-mid);
    Merge(A,L,mid,R,n-mid);
    free(L);
    free(R);
}
void printArray(int arr[],int n)
{
    int i;
    for(i=0;i<n;i++)
    cout<<arr[i]<<"\t";
    cout<<endl;
}
int main()
{
    int n;
    cout << "Enter the number of elements: ";
    cin >> n;
    int arr[n];
    for(int i = 0; i<n; i++)
    {
        cout<<"Enter the values: " << endl;
        for(i=0;i<n;i++)
        cin>>arr[i];
        cout<<endl;
    }
    cout<<"Unsorted Array: \n";
    printArray(arr,n);cout<<endl;
    MergeSort(arr, n);
    cout<<endl;
    cout<<"Sorted Array: \n";
    printArray(arr, n);
    return 0;
}

#include<iostream>
using namespace std;
int search(int arr[],int n,int x)
{
int i;
 for(i=0;i<n;i++)
 if(arr[i]==x)
 return i;
 return -1;
}
int main()
{
int arr[]={2,5,4,10,8,6,30};
int x=10;
int n=sizeof(arr)/sizeof(arr[0]);
int result=search(arr,n,x);
(result==-1)?cout<<"number is not present in array"
            :cout<<"number is present in index "<<result;
return 0;
}

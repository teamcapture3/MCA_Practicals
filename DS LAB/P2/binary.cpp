#include<iostream>
using namespace std;
int binarys(int arr[],int low,int high,int x)
{
	if(high>=1){
		int mid=low+(high+1)/2;
			if(arr[mid]==x)
			   return mid;
			if(arr[mid] > x)
		     	return binarys(arr,low,mid-1,x);
			  return binarys(arr,mid+1,high,x);
	}
   return -1;
}
int main()
{
	int arr[] = {5,8,60,40,70};
	int x=40;
	int n= sizeof(arr) / sizeof(arr[0]);
	int result =binarys(arr,0,n-1,x);
	(result==-1) ? cout<<"element is not present in array"
				 : cout<<"element is present in index"<<result;
	return 0;
}

#include<iostream>
using namespace std;
int interpolation(int arr[],int n,int x)
{
	int low=0;
	int high(n-1);
	while(low<=high && x>=arr[low] && x<=arr[high])
	{
		if(low==high)
		{
			if(arr[low]==x)
			return low;
		}
			int pos=low+(high-low)*(x-arr[low])/(arr[high]-arr[low]);
			if(arr[pos]==x)
				return pos;
			if(arr[pos]>x)
				low=pos-1;
			else
				high=pos+1;
	}
return -1;
}
int main()
{
	int arr[]={4,21,11,10,15,47,49,55,56};
	int n=sizeof(arr)/sizeof(arr[0]);
	int x=47;
	int index=interpolation(arr,n,x);
	if(index!=0)
	 cout<<"element is found at index"<<index;
	 else
	 cout<<"element is not found";
	 return 0;
}

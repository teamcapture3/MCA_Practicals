//exp2 d) largest and smallest
#include<iostream.h>
#include<conio.h>
void main()
{
	clrscr();
	int arr[10],n,i,max,min;
	cout<<"Enter the numbers: ";
	cin>>n;
	cout<<"Enter "<<n<<" number:\n";
	for(i=0;i<n;i++)
	cin>>arr[i];
	max=arr[0];
	for(i=0;i<n;i++)
	{
		if(max<arr[i])
		max=arr[i];
	}
	min=arr[0];
	for(i=0;i<n;i++)
	{
		if(min>arr[i])
		min=arr[i];
	}
	cout<<"Greatest Number is: "<<max<<endl;
	cout<<"Smallest Number is: "<<min;
	getch();
}

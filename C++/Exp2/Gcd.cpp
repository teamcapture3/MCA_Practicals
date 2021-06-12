//exp2 c) GCD
#include<iostream.h>
#include<conio.h>
#include<string.h>
void main()
{
	clrscr();
	int a,b;
	cout<<"Enter Value Of a:";
	cin>>a;
	cout<<"Enter Value Of b:";
	cin>>b;
	while(a!=b)
	{
		if(a>b)
		a=a-b;
		else
		b=b-a;
	}
	cout<<"GCD of A & B are"<<a<<endl;
	getch();
}
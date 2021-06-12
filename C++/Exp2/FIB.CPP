//exp2 b) Fibonacci
#include<iostream.h>
#include<conio.h>
void main()
{
	clrscr();
	int a=1,b=0,c;
	while(b<=13)
	{
		cout<<b;
		c=a+b;
		a=b;
		b=c;
	}
getch();
}
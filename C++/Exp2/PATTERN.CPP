//exp2 f) Pattern
#include<iostream.h>
#include<conio.h>
void main()
{
	clrscr();
	int n=5;
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=i;j++)
		{
			cout << j << " ";
		}
		cout << endl;
	}
	for(i=n-1; i>=1; --i)
	{
		for(int j=1; j<=i; ++j)
		{
			cout << j << " ";
		}
		cout << endl;
	}
	getch();
}

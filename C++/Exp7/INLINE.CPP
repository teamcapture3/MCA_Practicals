#include<iostream.h>
#include<conio.h>
inline int add(int x,int y)
{
return x+y;
}

inline int sub(int x,int y)
{
return x-y;
}

inline int mul(int x,int y)
{
return x*y;
}

inline int div(int x,int y)
{
return x/y;
}

inline int mod(int x,int y)
{
return x%y;
}

void main()
{
	clrscr();
	cout<<"Addition of the number is:"<<add(30,20)<<endl;
	cout<<"Subtraction of the number is:"<<sub(30,20)<<endl;
	cout<<"Multiplication of the number is:"<<mul(30,20)<<endl;
	cout<<"Division of the number is:"<<div(30,20)<<endl;
	cout<<"Modulus of the number is:"<<mod(30,20)<<endl;
	getch();
}

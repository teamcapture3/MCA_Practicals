//exp2 e)operator
#include<iostream.h>
#include<conio.h>
#include<stdio.h>
void main()
{
	clrscr();
	int a=21;
	int b=10;
	int c;
	//modulus
	c=a%b;
	cout<< "Modulus of c is:"<< c << endl;
	//conditional
	c=(a>b)?a:b;
	cout<< "Conditional of a: " << c << endl;
	//increment and decrement
	c=a++;
	cout<<"Increment of c is: "<<c<<endl;
	c=++a;
	cout<<"Decrement of c is: "<<c<<endl;
	//bitwise and
	c=a&b;
	cout<<"Bitwise and of c is: "<<c<<endl;
	//bitwise or
	c=a|b;
	cout<<"Bitwise or of c is: "<<c<<endl;
	//bitwise XOR
	c=a^b;
	cout<<"Bitwise XOR of c is: "<<c<<endl;
	//bitwise  left shift
	b=a<<2;
	cout<<"Bitwise left of b is: "<<b<<endl;
	//bitwise right shift
	b=a>>2;
	cout<<"Bitwise right of b is: "<<b<<endl;
	getch();
}
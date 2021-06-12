#include<iostream.h>
#include<conio.h>

class Complex
{
	int real,imag;
	public:
		void get()
		{
			cin>>real>>imag;
		}
		void disp()
		{
			cout<<real<<"+"<<imag<<"i";

		}
	       Complex sum(Complex);
};
Complex Complex::sum(Complex c2)
{       Complex c4;
	c4.real=real+c2.real;
	c4.imag=imag+c2.imag;
	return c4;
}
void main()
{       clrscr();
	Complex c1,c2,c5;
	cout<<"Enter 1st Complex number: ";
	c1.get();
	cout<<"Enter 2nd Complex number: ";
	c2.get();
	cout<<"The 1st Complex number is: ";
	c1.disp();
	cout<<"\nThe 2nd Complex number is: ";
	c2.disp();
	c5=c1.sum(c2);
	cout<<"\nThe Sum of two Complex number is: ";
	c5.disp();
	getch();

}
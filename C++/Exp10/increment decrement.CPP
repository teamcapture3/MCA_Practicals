#include<iostream>
using namespace std;
class Complex
{
	int real,imag;
	public:
		Complex()
		{
		 real=0;
		 imag=0;
		}
		Complex(int r, int i)
		{
		 real=r;
		 imag=i;
		}
		void get()
		{
		   cout<<"Enter Real and Imaginary parts of the complex number:"<<endl;
		   cin>>real;
		   cin>>imag;
		}
		void disp()
		{
		 cout<<real<<"+"<<imag<<"i"<<endl;
		}
		void operator ++()
		{
		  real=++real;
		}
		void operator --()
		{
		  real=--real;
		}

};
int main()
{
	Complex c1;
	c1.get();
	++c1;
	cout<<"\nThe Incremented Value of the Complex number is:";
	c1.disp();
	--c1;
	cout<<"\nThe Decremented Value of the Complex number is:";
	c1.disp();
	return 0;
}

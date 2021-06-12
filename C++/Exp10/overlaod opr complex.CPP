#include<iostream>
using namespace std;
class Complex
{
	int real,imag;
	public:
		Complex()
		{
		real=imag=0;
		}
		Complex(int r, int i)
		{
		 real=r;
		 imag=i;
		}
		void get()
		{
		 cin>>real>>imag;
		}
		void disp()
		{
		 cout<<real<<" + "<<imag<<"i\n";
		}
		Complex operator +(Complex c)
		{
		 Complex temp;
		 temp.real=real+c.real;
		 temp.imag=imag+c.imag;
		 return temp;
		}
};
int main()
{
    Complex c1,c2,c3;
	cout<<"\n\t\t\t: Complex number Addition :";
	cout<<"\n\nEnter first complex num: ";
	c1.get();
	cout<<"\nEnter second complex num: ";
	c2.get();
	cout<<"\nFirst complex num is: ";
	c1.disp();
	cout<<"\nSecond complex num is: ";
	c2.disp();
	c3=c1+c2;
	cout<<"\n\nThe resultant complex number is : ";
	c3.disp();
	return 0;
}

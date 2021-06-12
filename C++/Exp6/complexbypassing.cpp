#include<iostream.h>
#include<conio.h>
class Complex
{
int real,imag;
public:
 		void readData()
{
 			cout << "Enter real and imaginary number respectively:";
 			cin >> real >> imag;
}
void addComplexNumbers(Complex comp1, Complex comp2)
{
 		real=comp1.real+comp2.real;
 		imag=comp1.imag+comp2.imag;
}
void displaySum()
{
 			cout << "Sum = " << real<< "+" << imag << "i";
}
};
void main()
{
 			clrscr();
 			Complex c1, c2, c3;
 			c1.readData();
 			c2.readData();
 			c3.addComplexNumbers(c1, c2);
 			c3.displaySum();
 			getch();
}

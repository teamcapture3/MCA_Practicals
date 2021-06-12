#include<iostream.h>
#include<conio.h>
#include<stdio.h>
class Figure
{
    public:
    double x;
    virtual void show()=0;
};
class Square:public Figure
{
private :
    double area;
public:
    Square(double s)
    {
	x=s;
    }
    void Area()
    {
	area=x*x;
    }
    void show()
    {
	cout<<"Area of square: "<<area<<endl;
    }
};
class Circle:public Figure
{
    private:
	double area;
    public:
    Circle(double r)
    {
	x=r;
    }
    void Area()
    {
	area=3.14*x*x;
    }
    void show()
    {
	cout<<"Area of circle: "<<area<<endl;
    }
};
class SquarePrism:public Square
{
    private:
	double height;
	double area;
    public:
	SquarePrism(double s,double h):Square(s)
	{
	    height=h;
	}
	void Area()
	{
	    area=(2*x*x)+(4*x*height);
	}
	void show()
	{
	    cout<<"Area of square prism: "<<area<<endl;
	}
};
class Cylinder:public Circle
{
    private:
	double height;
	double area;
    public:
	Cylinder(double r,double h):Circle(r)
	{
	    height=h;
	}
	void Area()
	{
	    area=(2*3.14*x*height)+(2*3.14*x);
	}
	void show()
	{
	    cout<<"Area of cylinder: "<<area<<endl;
	}
};
void main()
{
    clrscr();
    Square s1(12.2);
    Circle c1(11.5);
    SquarePrism sp1(12.2,2.0);
    Cylinder cy1(11.5,13.0);
    Figure *f1[4];
    int i;
    s1.Area();
    f1[0]=&s1;
    c1.Area();
    f1[1]=&c1;
    sp1.Area();
    f1[2]=&sp1;
    cy1.Area();
    f1[3]=&cy1;
    for(i=0;i<4;i++)
    {
	f1[i]->show();
    }
    getch();
}
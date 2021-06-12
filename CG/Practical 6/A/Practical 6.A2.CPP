#include<iostream.h>
#include<graphics.h>
#include<dos.h>
#include<conio.h>
void boundaryfill(int x,int y,int f_color,int b_color)
{
	if(getpixel(x,y)!=b_color && getpixel(x,y)!=f_color)
	{
		putpixel(x,y,f_color);
		boundaryfill(x+1,y,f_color,b_color);
		boundaryfill(x,y+1,f_color,b_color);
		boundaryfill(x-1,y,f_color,b_color);
		boundaryfill(x,y-1,f_color,b_color);
		boundaryfill(x-1,y-1,f_color,b_color);
		boundaryfill(x-1,y+1,f_color,b_color);
		boundaryfill(x+1,y-1,f_color,b_color);
		boundaryfill(x+1,y+1,f_color,b_color);
	}
}
void main()
{
	clrscr();
	int gd = DETECT, gm;
	initgraph(&gd,&gm,"C:/TURBOC3/BGI");
	int a,b,c,d;
	cout<<"Enter the X and Y positions of rectangle: \n";
	cin>>a>>b;
	cout<<"Enter the breadth and length of Rectangle: \n";
	cin>>c>>d;
	rectangle(a,b,c,d);
	int x = (a+c)/2;
	int y = (b+d)/2;
	boundaryfill(x,y,4,15);
	delay(100);
	getch();
	closegraph();
}

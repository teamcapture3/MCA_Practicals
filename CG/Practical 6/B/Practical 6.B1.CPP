#include<stdio.h>
#include<conio.h>
#include<graphics.h>
#include<dos.h>
#include<iostream.h>
void flood(int,int,int,int);
void main()
{
	int gd=DETECT,gm;
	initgraph(&gd,&gm,"C:/TURBOC3/BGI");
	int a,b,c,d;
	cout<<"Enter the X and Y positions of rectangle: \n";
	cin>>a>>b;
	cout<<"Enter the breadth and length of Rectangle: \n";
	cin>>c>>d;
	rectangle(a,b,c,d);
	int x = (a+c)/2;
	int y = (b+d)/2;
	flood(x,y,10,0);
	getch();
	closegraph();
}
void flood(int x,int y,int fillColor, int defaultColor)
{
	if(getpixel(x,y)==defaultColor)
	{
		delay(1.8);
		putpixel(x,y,fillColor);
		flood(x+1,y,fillColor,defaultColor);
		flood(x-1,y,fillColor,defaultColor);
		flood(x,y+1,fillColor,defaultColor);
		flood(x,y-1,fillColor,defaultColor);
	}
}
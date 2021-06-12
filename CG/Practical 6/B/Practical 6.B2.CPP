#include<stdio.h>
#include<graphics.h>
#include<dos.h>
#include<conio.h>
#include<iostream.h>
void floodfill(int x,int y,int old,int newcol)
{
int current;
current=getpixel(x,y);
if(current==old)
{
delay(5);
putpixel(x,y,newcol);
floodfill(x+1,y,old,newcol);
floodfill(x-1,y,old,newcol);
floodfill(x,y+1,old,newcol);
floodfill(x,y-1,old,newcol);
floodfill(x+1,y+1,old,newcol);
floodfill(x-1,y+1,old,newcol);
floodfill(x+1,y-1,old,newcol);
floodfill(x-1,y-1,old,newcol);
}
}
void main()
{
	int gd=DETECT,gm;
	initgraph(&gd,&gm,"C:/TURBOC3/BGI");
	int a,b,c,d;
	cout<<"Enter the positions of rectangle: \n";
	cin>>a>>b;
	cout<<"Enter the length and breadth of rectangle: \n";
	cin>>c>>d;
	rectangle(a,b,c,d);
	int x = (a+c)/2;
	int y = (b+d)/2;
	floodfill(x,y,0,15);
	getch();
	closegraph();
}

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
	}
}
void main()
{
	clrscr();
	int gm,gd=DETECT,r;
	int x,y;
	cout<<"Enter 'X' and 'Y' positions of the Circle:\n";
	cin>>x>>y;
	cout<<"Enter Radius of the Circle:";
	cin>>r;
	initgraph(&gd,&gm,"C:/TURBOC3/BGI");
	circle(x,y,r);
	boundaryfill(x,y,4,15);
	delay(100);
	getch();
	closegraph();
}

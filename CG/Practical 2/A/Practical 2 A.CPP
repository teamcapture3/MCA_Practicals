#include <graphics.h>
#include <iostream.h>
#include <math.h>
#include <conio.h>
void DDA(float x1,float y1,float x2,float y2)
{
	float dy,dx,x,y,m;
	x=x1;y=y1;
	dx=x2-x1;
	dy=y2-y1;
	if(dy>dx)
	{
		m=dx/dy;
		while(y<y2)
		{
			y=y+1;
			x=x+m;
			putpixel(ceil(x),ceil(y),15);
		}
	}
	else
	{
		m=dy/dx;
		while(x<x2)
		{
			x=x+1;
			y=y+m;
			putpixel(ceil(x),ceil(y),15);
		}
	}
}
int main(void)
{
	clrscr();
	int gdriver = DETECT, gmode, errorcode;
	float x1,y1,x2,y2;
	cout<<"Enter co-ordinates of first point: ";
	cin>>x1>>y1;
	cout<<"Enter co-ordinates of second point: ";
	cin>>x2>>y2;
	initgraph(&gdriver, &gmode, "C:/TC/BGI");
	DDA(x1,y1,x2,y2);
	getch();
	closegraph();
	return 0;
}
#include<stdio.h>
#include<conio.h>
#include<iostream.h>
#include<graphics.h>
#include<math.h>
#include<dos.h>
void draw(float x1,float y1,float x2,float y2)
{
	int dx, dy, p, end;
	float x, y;
	dx = abs(x1 - x2);
	dy = abs(y1 - y2);
	p = 2*dy-dx;
	if(x1>x2)
	{
		x =x2;
		y =y2;
		end =x1;
	}
	else
	{
		x =x1;
		y =y1;
		end =x2;
	}
	putpixel(x,y,10);
	while(x<end)
	{
		x = x+1;
		if(p<0)
		{
			p = p+2*dy;
		}
		else
		{
			y = y+1;
			p = p+2*(dy - dx);
		}
		putpixel(x, y,WHITE);
		delay(10);
	}
}
void main()
{
	clrscr();
	int gd = DETECT, gm;
	float x1, x2, y1, y2, i;
	initgraph(&gd, &gm, "C:/TC/BGI");
	cout<<"Enter co-ordinates of X1: ";
	cin>>x1;
	cout<<"Enter co-ordinates of Y1: ";
	cin>>y1;
	cout<<"Enter co-ordinates of X2: ";
	cin>>x2;
	cout<<"Enter co-ordinates of Y2: ";
	cin>>y2;
	draw(x1,y1,x2,y1);
	draw(x1+10,y1,x2+10,y2);
	for(i=20;i<90;i+=10)
	{
		draw(x1+i,y1,x2+i,y2);
	}
	getch();
	closegraph();
}

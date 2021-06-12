#include <graphics.h>
#include <stdlib.h>
#include <stdio.h>
#include <iostream.h>
#include <conio.h>
#include <math.h>
#include <dos.h>

void DCircle(int xc,int yc,int x,int y)
{
    putpixel(x+xc,y+yc,15);
    putpixel(x+xc,-y+yc,15);
    putpixel(-x+xc,-y+yc,15);
    putpixel(-x+xc,y+yc,15);
    putpixel(y+xc,x+yc,15);
    putpixel(y+xc,-x+yc,15);
    putpixel(-y+xc,-x+yc,15);
    putpixel(-y+xc,x+yc,15);
}

void BCircle(int xc,int yc,int r)
{
	int x=0,y=r,d=3-(2*r);
    DCircle(xc,yc,x,y);
    while(x<=y)
	{
		if(d<=0)
	    {
			d=d+(4*x)+6;
		}
		else
		{
			d=d+(4*x)-(4*y)+10;
			y=y-1;
		}
		x=x+1;
		delay(100);
		DCircle(xc,yc,x,y);
    }
}

int  main(void)
{
	clrscr();
    int xc,yc,r,gdriver = DETECT, gmode, errorcode;
    initgraph(&gdriver, &gmode, "C:\\TURBOC3\\BGI");
    cout<<"Bresenham's circle drawing algorithm:\n";
    cout<<"Enter the values of xc and yc: ";
    cin>>xc>>yc;
    cout<<"Enter the value of radius: ";
    cin>>r;
    BCircle(xc,yc,r);
    getch();
    closegraph();
    return 0;
}

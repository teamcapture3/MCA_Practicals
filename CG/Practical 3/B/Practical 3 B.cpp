#include<iostream.h>
#include<graphics.h>
#include<conio.h>
#include<dos.h>

void drawcircle(int x0, int y0, int radius)
{
    int x = radius;
    int y = 0;
    int err = 0;
    while (x >= y)
    {
	    putpixel(x0 + x, y0 + y, 15);
	    putpixel(x0 + y, y0 + x, 15);
	    putpixel(x0 - y, y0 + x, 15);
	    putpixel(x0 - x, y0 + y, 15);
	    putpixel(x0 - x, y0 - y, 15);
	    putpixel(x0 - y, y0 - x, 15);
	    putpixel(x0 + y, y0 - x, 15);
	    putpixel(x0 + x, y0 - y, 15);
	    if (err <= 0)
		{
			y += 1;
			err += 2*y + 1;
		}
		if (err > 0)
		{
			x -= 1;
			err -= 2*x + 1;
		}
		delay(100);
	}
}
int main()
{
	int gdriver=DETECT, gmode, error, x, y, r;
	initgraph(&gdriver, &gmode, "C:\\TURBOC3\\BGI");
	cout<<"\nMidpoint circle drawing algorithm \n";
	cout<<"Enter radius of circle: ";
	cin>>r;
	cout<<"\nEnter co-ordinates of center(x and y): ";
	cin>>x>>y;
	drawcircle(x, y, r);
	getch();
	return 0;
}

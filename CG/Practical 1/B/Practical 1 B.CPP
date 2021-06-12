#include <graphics.h>
#include <conio.h>
int main(void)
{
	int gdriver = DETECT, gmode, errorcode;
	int xmax, ymax;
	initgraph(&gdriver, &gmode, "C:\\TURBOC3\\BGI");
	xmax = getmaxx();
	ymax = getmaxy();
	circle(xmax/2,ymax/2,100);
	ellipse(xmax/2, ymax/2, 220, 320, 50,70);
	ellipse((xmax/2)-40,(ymax/2)-15,0,360,12,15);
	arc((xmax/2)+40,(ymax/2)+10,40,130,20);
	arc((xmax/2)+40,(ymax/2)+10,40,90,35);
	arc((xmax/2)-40,(ymax/2)-15,90,150,30);
	getch();
	closegraph();
	return 0;
}
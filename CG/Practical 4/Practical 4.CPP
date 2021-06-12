#include<iostream.h>
#include<stdio.h>
#include<conio.h>
#include<graphics.h>
void draw(float xc,float yc,float rx,float ry)
{
float p1,p2,x,y;
x=0;y=ry;
//Region One
p1=ry*ry-rx*rx*(ry-1/4.0);
while(2*ry*ry*x<2*rx*rx*y)
{
x++;
if(p1<0)
{
p1+=2*ry*ry*(x)+ry*ry;
}
else
{
y--;
p1+=2*ry*ry*x-2*rx*rx*y+ry*ry;
}
putpixel(xc+x,yc+y,RED);
putpixel(xc-x,yc+y,RED);
putpixel(xc+x,yc-y,RED);
putpixel(xc-x,yc-y,RED);
}
p2=ry*ry*(x+1/2.0)*(x+1/2.0)+rx*rx*(y-1.0)*(y-1.0)-rx*rx*ry*ry;
while(y!=0)
{
y--;
if(p2<0)
{
p2+=-2*rx*rx*y+rx*rx;
}
else{
x++;
p2+=2*ry*ry*x-2*rx*rx*y+rx*rx;
}
putpixel(xc+x,yc+y,RED);
putpixel(xc-x,yc+y,RED);
putpixel(xc+x,yc-y,RED);
putpixel(xc-x,yc-y,RED);
}
}
float main()
{
int gd=DETECT,gm;
float rx,ry,xc,yc;
initgraph(&gd,&gm,"C:/TURBOC3/BGI");
cout<<"Midpoint Ellipse Drawing Alogorithm \n";
cout<<"Enter center axis: ";
cin>>xc>>yc;
cout<<"Enter major axis: ";
cin>>rx;
cout<<"Enter minor axis: ";
cin>>ry;
draw(xc,yc,rx,ry);
getch();
closegraph();
return 0;
}
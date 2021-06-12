#include<graphics.h>
#include<iostream.h>
#include<conio.h>
#include<alloc.h>
#include<dos.h>
void main()
{
int gd=DETECT,gm;
initgraph(&gd,&gm,"C:\\TURBOC3\\BGI");
void *buffer;
unsigned int size;
line(230,330,370,330);
line(230,350,370,350);
line(226,335,226,345);
line(226,335,230,330);
line(226,345,230,350);
line(374,335,374,345);
line(374,335,370,330);
line(374,345,370,350);
outtextxy(235,365,"Loading Program...");
int x=232,y=336,x1=236,y1=344;
for(int i=1;i<5;i++)
{
setfillstyle(1,WHITE);
bar(x,y,x1,y1);
x=x1+2;
x1=x1+6;
}
size=imagesize(232,336,256,344);
buffer=malloc(size);
getimage(232,336,256,344,buffer);
x=232;
int m=0;
while(!kbhit())
{
putimage(x,336,buffer,XOR_PUT);
x=x+2;
if(x>=350)
{
m++;
x=232;
if(m==5)
return;
}
putimage(x,336,buffer,XOR_PUT);
delay(20);
}
getch();
}

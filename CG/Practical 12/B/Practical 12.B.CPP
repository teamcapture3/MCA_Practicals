#include<iostream.h>
#include<fstream.h>
#include<conio.h>
#include<string.h>
#include<math.h>
#include<graphics.h>
struct pix
{
unsigned char b,g,r;
}pixel; class logtr
{
int L;
char Header[54];
int c;
ifstream in;
ofstream out,out1;
public:
logtr()
{
L=255;
}
void process()
{
char infile[]="cat.bmp";
char outfile[]="output1.bmp";
char imdata[]="logdata.rtf";
in.open(infile,ios::in|ios::binary);
in.read(( char*)(&Header),sizeof(Header));
out.open(outfile,ios::out| ios::binary);
out.write(( char*)(&Header),sizeof(Header));
out1.open(imdata, ios::out);
c=L/log(1+L); while(!in.eof())
{
in.read((char *)(&pixel),sizeof(pixel));
out1<<"ORIGINAL : " <<(int)pixel.r<<" ,"<<(int)pixel.g<<" , "<<(int)pixel.b<<endl; pixel.r=c*log(1+pixel.r);
pixel.g=c*log(1+pixel.g); pixel.b=c*log(1+pixel.b);
out.write((char *)(&pixel),sizeof(pixel));
out1<<"MODIFIED : " <<(int)pixel.r<<" ,"<<(int)pixel.g<<" ,"<<(int)pixel.b<<endl;
}
in.close();
out.close();
}
};
void main(){
clrscr();
int gd=DETECT,gm; initgraph(&gd,&gm,"C:\\TURBOC3\\BGI");
setcolor(BLUE);
logtr l; l.process();
cout<<"Log Transformation Done Successfully";
getch();
}

#include<iostream.h>
#include<fstream.h>
#include<conio.h>
#include<string.h>
#include<math.h>
struct pix
{
unsigned char b,g,r;
}pixel1,pixel2;
int L=255;
char Header[54];
int c;
ifstream in1,in2;
ofstream out,out1;
class sub
{
public:
void process()
{
char infile1[]="cat.bmp";
char infile2[]="cat2.bmp";
char outfile[]="cat-sub.bmp";
char imdata[]="imdata.dat";
in1.open(infile1,ios::in|ios::binary);
in2.open (infile2,ios::in|ios::binary);
in1.read(( char*)(&Header),sizeof(Header));
in2.read(( char*)(&Header),sizeof(Header));
out.open(outfile,ios::out| ios::binary);
out.write(( char*)(&Header),sizeof(Header));
out1.open(imdata, ios::out);
while(!in1.eof()||!in2.eof())
{
in1.read((char *)(&pixel1),sizeof(pixel1));
in2.read((char *)(&pixel2),sizeof(pixel2));
out1<<"ORIGINAL : " <<(int)pixel1.r<<" , "<<(int)pixel1.g<<" , "<<(int)pixel1.b<<endl;
pixel1.r=pixel1.r-pixel2.r;
pixel1.g=pixel1.g-pixel2.g;
pixel1.b=pixel1.b-pixel2.b;
out.write((char *)(&pixel1),sizeof(pixel1));
out1<<"MODIFIFED (subtraction) : " <<(int)pixel1.r<<" , "<<(int)pixel1.g<<" , "<<(int)pixel1.b<<endl;
}
in1.close();
in2.close();
out.close();
}
};
int main()
{
clrscr();
sub s;
s.process();
getch();
}
#include<iostream.h>
#include<fstream.h>
#include<conio.h>
#include<string.h>
#include<math.h>
struct pix
{
unsigned char b,g,r;
}pixel;
class powerlaw
{
int L;
char Header[54];
float gamma;
ifstream in;
ofstream out,out1;
public:
void process()
{
L=255;
char infile[]="cat.bmp";
char outfile[]="output2.bmp";
char imdata[]="logdata.rtf";
in.open(infile,ios::in|ios::binary);
in.read(( char*)(&Header),sizeof(Header));
out.open(outfile,ios::out| ios::binary);
out.write(( char*)(&Header),sizeof(Header));
out1.open(imdata, ios::out);
cout<<"Enter gamma value (0 To 1):"; cin>>gamma;
while(!in.eof())
{
in.read((char *)(&pixel),sizeof(pixel));
out1<<"ORIGINAL : " <<(int)pixel.r<<" , "<<(int)pixel.g<<" , "<<(int)pixel.b<<endl; pixel.r=pow(pixel.r,gamma); pixel.g=pow(pixel.g,gamma); pixel.b=pow(pixel.b,gamma);
out.write((char *)(&pixel),sizeof(pixel));
out1<<"MODIFIED : " <<(int)pixel.r<<" , "<<(int)pixel.g<<" , "<<(int)pixel.b<<endl;
}
in.close();
out.close();
}
};
int main()
{
clrscr();
powerlaw p;
p.process();
getch();
}

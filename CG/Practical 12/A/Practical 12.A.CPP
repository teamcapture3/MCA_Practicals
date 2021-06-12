#include<iostream.h>
#include<fstream.h>
#include<conio.h>
#include<string.h>
struct pix {
unsigned char b,g,r;
}
pixel;
int L=255;
char Header[54];
ifstream in;
ofstream out,out1;
void main() {
clrscr();
char infile[]="C:\\TURBOC3\\BIN\\cat.bmp";
char outfile[]="C:\\TURBOC3\\BIN\\output.bmp";
char imdata[]="C:\\TURBOC3\\BIN\\logdata.rtf";
in.open(infile,ios::in|ios::binary);
in.read((char*)(&Header),sizeof(Header));
out.open(outfile,ios::in|ios::binary);
out.write((char*)(&Header),sizeof(Header));
out1.open(imdata,ios::out);
while(!in.eof()) {
in.read((char*) (&pixel),sizeof(pixel));
out1<<"ORIGINAL : "<<(int)pixel.r<<" "<<(int)pixel.g<<" "<<(int)pixel.b<<endl;
pixel.r=L-pixel.r;
pixel.g=L-pixel.g;
pixel.b=L-pixel.b;
out.write((char*) (&pixel),sizeof(pixel));
out1<<"MODIFIED (NEGATIVE) : "<<(int)pixel.r<<" "<<(int)pixel.g<<" "<<(int)pixel.b<<endl; }
in.close();
cout<<"Negative Transformation Done Successfully";
getch();
}
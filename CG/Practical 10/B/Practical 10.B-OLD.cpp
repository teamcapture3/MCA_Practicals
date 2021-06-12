#include<iostream.h>
#include<conio.h>
void printSierpinski(int n)
{
for (int y = n - 1; y >= 0; y--) {
for (int i = 0; i < y; i++) {
cout<<" ";
}
for (int x = 0; x + y < n; x++) {
if(x & y)
cout<<" "<<" ";
else
cout<<"+ ";
}
cout<<endl;
}
}
int main()
{
clrscr();
int n = 16;
printSierpinski(n);
getch();
return 0;
}

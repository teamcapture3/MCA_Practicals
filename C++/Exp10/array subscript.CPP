#include<iostream>
using namespace std;
class Demo
{
   int *p;
   public:
	  int operator [](int x)
	  {
		return p[x];
	  }
	  Demo(int n);
};
Demo::Demo(int n)
{
	p=new int [n];
	for(int i=0;i<n;i++)
	p[i]=i+1;
}
int main()
{
Demo d(10);
for(int i=0;i<10;i++)
cout<<d[i]<<" ";
return 0;
}

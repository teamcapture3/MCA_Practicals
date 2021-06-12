#include<iostream>
using namespace std;

class Static
{
	static int s;
	public:
	int stat()
	{
		s++;
		return s;
	}
};
int Static::s=0;
int main()
{
	Static a;
	cout<<"First Number: "<<a.stat()<<endl;
	cout<<"Second Number: "<<a.stat()<<endl;
	cout<<"Third Number: "<<a.stat()<<endl;
	cout<<"Fourth Number: "<<a.stat()<<endl;
	cout<<"Fifth Number: "<<a.stat()<<endl;
	return 0;
}

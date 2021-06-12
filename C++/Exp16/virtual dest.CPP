#include<iostream>
using namespace std;
class Base
{
 public:
 	virtual ~Base()
	{
		cout << "Base Class Destructor.";
		cout<<endl;
	}
};
class Derived:public Base
{
 public:
	~Derived()
	{
		cout<< "Derived Class Destructor.";
		cout<<endl;
	}
};
int main()
{
  Derived *d = new Derived();
  Base *b = d;
  delete b;
  return 0;
}

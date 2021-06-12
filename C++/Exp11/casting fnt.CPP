#include<iostream>
using namespace std;
class time12
{
	public:
	int hr,min;
	char c;
	time12()
	{
		hr=min=0;
	}
	void display()
	{
		cout<<"Time is: "<<hr<<":"<<min<<" "<<c<<"M"<<endl;
	}

	};

class time24
{
	public:
	int hr,min,sec;
	time24()
	{
	hr=min=sec=0;
	}
	void set()
	{
	cout<<"Enter hours: "<<endl;
	cin>>hr;
	cout<<"Enter minutes: "<<endl;
	cin>>min;
	}
	void display()
	{
	cout<<"Time is: "<<hr<<":"<<min<<endl;
	}
	 operator time12()
	{
	  time12 obj;

	  if(1<=hr && hr<=12){
	  if(hr==12)
	  obj.c='P';
	  else
	  obj.c='A';
	  obj.hr=hr;
	  obj.min=min;
	  }
	  if(12<hr && hr<=23){
	  obj.c='P';
	  obj.hr=hr-12;
	  obj.min=min;
	  }
	  if(hr==0 || hr==24)
	  {
	  obj.c='A';
	  obj.hr=0;
	  obj.min=min;
	  }
	  return obj;
	}
};

int main()
{
	time24 a;
	time12 b;
	a.set();
	a.display();
	b=time12(a);
	b.display();
	return 0;
}


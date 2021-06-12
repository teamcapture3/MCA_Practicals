#include<iostream>
using namespace std;
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
		cout<<"Enter hours :"<<endl;
		cin>>hr;
		cout<<"Enter minutes :"<<endl;
		cin>>min;
	}
	void display()
	{
		cout<<"Time is: "<<hr<<":"<<min<<endl;
	}
};
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
	time12(time24 ob)
	{
		if(1<=ob.hr<12)
		{
			c='A';
			hr=ob.hr;
			min=ob.min;
		}
		if(12<=ob.hr<=23)
		{
			c='P';
			if(ob.hr==12)
				hr=ob.hr;
			else
				hr=ob.hr-12;
				min=ob.min;
		}
		if(ob.hr==0 || ob.hr==24)
		{
			c='A';
			hr=0;
			min=ob.min;
		}
	}
};
int main()
{
	time24 a;
	time12 b;
	a.set();
	a.display();
	b=a;
	b.display();
	return 0;
}


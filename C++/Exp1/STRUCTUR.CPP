//exp1
#include<iostream.h>
#include<conio.h>
struct std
{
	float per;
	int roll_no,s1,s2,s3,s4,s5;
	char name[20];
};
void main()
{
	clrscr();
	std k;
	cout<<"Enter Roll no: ";
	cin>>k.roll_no;
	cout<<"Enter Name: ";
	cin>>k.name;
	cout<<"Enter Marks Of 5 Subjects: ";
	cin>>k.s1>>k.s2>>k.s3>>k.s4>>k.s5;
	cout<<"Total Percentage: ";
	k.per=((k.s1+k.s2+k.s3+k.s4+k.s5)/500.0)*100;
	cout<<k.per<<"%";
	getch();
}

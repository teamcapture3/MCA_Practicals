//exp 3 election program using switch case
#include<iostream.h>
#include<stdio.h>
#include<conio.h>
void main()
{
	clrscr();
	int a=0,b=0,c=0,d=0,e=0,f=0,v=0;
	int b1=0,b2=0,b3=0,b4=0,b5=0,b6=0,n=0;
	cout<<"**********************"<<endl;
	cout<<"Press 1 to vote for A"<<endl;
	cout<<"Press 2 to vote for B"<<endl;
	cout<<"Press 3 to vote for C"<<endl;
	cout<<"Press 4 to vote for D"<<endl;
	cout<<"Press 5 to vote for E"<<endl;
	cout<<"**********************"<<endl;
	do
	{
		cout<<"Please Vote For Candicate:";
		cin>>v;
		switch(v)
		{
		case 1:
		b1++;
		a=b1;
		n++;
		break;
		case 2:
		b2++;
		b=b2;
		n++;
		break;
		case 3:
		b3++;
		c=b3;
		n++;
		break;
		case 4:
		b4++;
		d=b4;
		n++;
		break;
		case 5:
		b5++;
		e=b5;
		n++;
		break;
		default:
		b6++;
		f=b6;
		n++;
		break;
		}}
	while(n<9);
	cout<<"Total Votes Of A: "<<a<<endl;
	cout<<"Total Votes Of B: "<<b<<endl;
	cout<<"Total Votes Of C: "<<c<<endl;
	cout<<"Total Votes Of D: "<<d<<endl;
	cout<<"Total Votes Of E: "<<e<<endl;
	cout<<"Spolit Ballot: "<<f<<endl;
	if(a>b && a>c && a>d && a>e)
	cout<<"The winner is: A!!";
	else if(b>a && b>c && b>d && b>e)
	cout<<"The winner is: B!!";
	else if(c>a && c>b && c>d && c>e)
	cout<<"The winner is: C!!";
	else if(d>a && d>b && d>c && d>e)
	cout<<"The winner is: D!!";
	else if(e>a && e>b && e>c && e>d)
	cout<<"The winner is: E!!";
	else
	cout<<"There is a tie";
	getch();
}

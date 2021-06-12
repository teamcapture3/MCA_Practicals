#include<iostream.h>
#include<conio.h>
class StringDemo
{
    char str[20];
    public:

	   void getData()
	   {
	    cin>>str;
	   }
	   void display()
	   {
	    cout<<str<<endl;
	   }
	   StringDemo operator +(StringDemo s)
	   {
	    StringDemo temp;
	    for(int i=0;str[i]!='\0';i++)
	    temp.str[i]=str[i];
	    for(int j=0;s.str[j]!='\0';i++,j++)
	    temp.str[i]=s.str[j];
	    temp.str[i]='\0';

	    return temp;
	   }
};
	void main()
	{
	 clrscr();
	 StringDemo s1,s2,s3;
	 cout<<"Enter First string:"<<endl;
	 s1.getData();
	 cout<<"Enter Second string:"<<endl;
	 s2.getData();
	 cout<<"\nThe First String is:";
	 s1.display();
	 cout<<"\nThe Second String is:";
	 s2.display();
	 s3=s1+s2;
	 cout<<"\nThe concatenation of two string is:";
	 s3.display();
	 getch();

	}










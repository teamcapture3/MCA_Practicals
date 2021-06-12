#include<iostream>
#include<conio.h>
#include<stdlib.h>
using namespace std;
class stack
{
	     int stk[5];
	     int top;
      public:
	     stack()
	      {
		top=-1;
	       }
	     void push(int x)
	      {
		 if(top >  4)
		       {
			   cout <<"Stack Over Flow";
			   return;
		       }
		 stk[++top]=x;
		 cout <<"Inserted " <<x;
	       }
	     void pop()
	       {
		  if(top <0)
		   {
			 cout <<"Stack Under Flow";
			 return;
		    }
		    cout <<"Deleted " <<stk[top--];
		}
	     void topp()
	     {
		 {
		  if(top <0)
		   {
			 cout <<"Stack Under Flow";
			 return;
		    }
		    cout <<"Top Element is : " <<stk[top];
		}
	     }
	     void display()
	       {
		   if(top<0)
		    {
			    cout <<" Stack Empty ";
			    return;
		    }
		    for(int i=top;i>=0;i--)
			cout <<stk[i] <<" ";
		}
};
int main()
{
     int ch;
     stack st;
     while(1)
	{
	     cout <<"\n1.Push  2.Pop  3.Top  4.Display  5.Exit\nEnter ur choice: ";
	     cin >> ch;
	     switch(ch)
	      {
	       case 1:  cout <<"\nEnter the element: ";
			cin >> ch;
			st.push(ch);
			break;
	       case 2:  st.pop();  break;
	       case 3:  st.topp();  break;
	       case 4:  st.display();break;
	       case 5:  exit(0);
	       }
	 }
}

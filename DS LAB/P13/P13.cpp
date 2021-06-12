#include<iostream>
#include<conio.h>
#include<process.h>
using namespace std;
int main()
{
   int n=5,e,count=0,x,y;
   cout<<"Number of nodes = 5";
   int m[5][5];
   for(int i=0;i<n;i++)
   {  for(int j=0;j<n;j++)
     {
       m[i][j]=0;
     }
   }
   cout<<"\nEnter number of edges = ";
   cin>>e;
   while (count!=e)
   {
     cout<<"\nEnter the edge (where to where)"<<endl;
     cin>>x>>y;
     if(x<=5 && y<=5)
    { m[x-1][y-1]=1;
     m[y-1][x-1]=1;
    }
    else
      {cout<<"\nIncorrect Edges entered";
       getch();
      }
     count++;
   }
   cout<<"\nMatrix is: "<<endl;
   for(int w=0;w<n;w++)
   {
      for(int q=0;q<n;q++)
	 cout<<m[w][q]<<" ";
      cout<<endl;
   }
   getch();
}

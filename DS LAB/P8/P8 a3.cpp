#include<iostream>
#define SIZE 100
using namespace std;
class node
{
public:
   node()
   {
       next = NULL;
   }
 int data;
 node *next;
}*front=NULL,*rear=NULL,*n,*temp,*temp1;
class CircularLL
{
public:
   void insertion();
   void deletion();
   void display();
};
void CircularLL::insertion()
{
 n=new node[sizeof(node)];
 cout<<"\nEnter the Element: ";
 cin>>n->data;
 if(front==NULL)
 {
     front=n;
 }
 else
 {
     rear->next=n;
 }
 rear=n;
 rear->next=front;
}
void CircularLL::deletion()
{
 int x;
 temp=front;
 if(front==NULL)
 {
     cout<<"\nCircular List Empty!!!";
 }
 else
 {
    if(front==rear)
    {
      x=front->data;
      delete(temp);
      front=NULL;
      rear=NULL;
    }
    else
    {
       x=temp->data;
       front=front->next;
       rear->next=front;
       delete(temp);
    }
    cout<<"\nElement "<<x<<" is Deleted";
    display();
 }
}
void CircularLL::display()
{
 temp=front;
 temp1=NULL;
 if(front==NULL)
 {
   cout<<"\n\nCircular List Empty!!!";
 }
 else
 {
   cout<<"\n\nCircular List Elements are:\n\n";
   while(temp!=temp1)
   {
      cout<<temp->data<<"  ";
      temp=temp->next;
      temp1=front;
   }
 }
}
int main()
{
   CircularLL cqobj;
 int ch;
 do
 {
    cout<<"\n\n\tMain Menu Circular Link-List";
    cout<<"\n##########################";
    cout<<"\n1. Insert\n2. Delete\n3. Display\n4. Exit\n\nEnter Your Choice: ";
    cin>>ch;
    switch(ch)
    {
       case 1:
         cqobj.insertion();
         cqobj.display();
         break;
       case 2:
         cqobj.deletion();
         break;
       case 3:
         cqobj.display();
         break;
       case 4:
         break;
       default:
         cout<<"\n\nWrong Choice!!! Try Again.";
    }
 }while(ch!=4);
 return 0;
}

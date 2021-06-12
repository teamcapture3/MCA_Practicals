#include<iostream>
using namespace std;
class Node{
  public:
    int data;
    Node *next;
  Node()
  {
  }
    Node(int data)
    {
      this->data=data;
      next=NULL;
    }
}; 
class Queue{
  Node *front;
  Node *rear;
  public:
  Queue()
  {
    front=NULL;
    rear=NULL;
  }
  void enQueue(int data);
  void deQueue();
  void display();
 
};
void Queue::enQueue(int data)
{
  Node *newRec=new Node(data);
  if(front==NULL)
  {
    front=rear=newRec;
  }
  else{
    rear->next=newRec;
    rear=newRec;
 
  }
      cout<<"\n Inserted";
}
void Queue::deQueue()
{
  Node *delRec=front;
  if(front==NULL)
  {
    cout<<"\n Underflow!!";
  }else{
    front=front->next;
    cout<<"\n Deleted!!";
  }
  delete delRec;
}
void Queue::display(){
  if(front!=NULL)
  {
  for(Node *i=front;i!=NULL;i=i->next)
  {
    cout<<"\t"<<i->data;
  } 
  }
  else{
  cout<<"\n No data Exists";
  }
}
int main()
{
  int choice;
  Queue obj;
  int data;
  do{
    cout<<"\n*********Menu*******";
    cout<<"\n1) Insert an Element";
    cout<<"\n2) Remove Element";
    cout<<"\n3) Display Data";
    cout<<"\n********************";
    cout<<"\n Enter your choice:";
    cin>>choice;
    switch(choice)
    {
      case 1:
        cout<<"\n Enter Data to be Inserted:";
        cin>>data;
        obj.enQueue(data);
        break;
      case 2:
        obj.deQueue();
        break;
      case 3:
        obj.display();
        break;
      default:
        cout<<"\n Plz enter proper value!";
    }
  }while(choice!=4);
  return 0;
}

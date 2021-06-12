#include<iostream>
#include<stdio.h>
using namespace std;
class Queue{
  int front;
  int rear;
  int size;
  int arr[20];
  public:
  Queue()
  {
  front=rear=-1;  
  }
  void enQueue(int data,int size);
  void deQueue();
  void display();
};
void Queue::enQueue(int data,int size)
{
  this->size=size;
  if(front==rear)
  {
    front=rear=0;
  }
  if(rear==size)
  {
    cout<<"\n Full!";
  }
  if(size>rear)
  {
    arr[rear]=data;
    ++rear;
    cout<<"\nInsetred Data";
  }
}
void Queue::deQueue()
{
  if(front==-1 || front==size)
  cout<<"\n No! Data";
  else{
  front++;
  cout<<"\n Deleted!";
  }
}
void Queue::display(){
  if(front!=rear)
  {
    for(int i=front;i<rear;i++)
    {
      cout<<arr[i]<<" ";
    }
  }else{
    cout<<"\n No Data Exists!!!";
  }
}
int main()
{
  int choice;
  int size;
  Queue obj;
  int data;
  cout<<"\n Enter Size of array";
  cin>>size;  
  do{
    cout<<"\n*********Menu*******";
    cout<<"\n 1) Insert an Element";
    cout<<"\n 2) Remove Element";
    cout<<"\n 3) Display Data";
    cout<<"\n********************";
    cout<<"\n Enter your choice";
    cin>>choice;
    switch(choice)
    {
      case 1:
        cout<<"\n Enter Data to be Inserted:";
  cin>>data;
        obj.enQueue(data,size);
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

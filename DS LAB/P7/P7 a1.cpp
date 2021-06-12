#include <iostream>
using namespace std;
class Node
{
public:
  int Priority;
  int roll_number;
  Node *next;
  Node *previous;
  Node(int p, int r)
  {
    Priority = p;
    roll_number = r;
    next = NULL;
    previous = NULL;
  }
};
class d_link_list
{
private:
  Node *first;
  Node *last;
public:
  d_link_list()
  {
    first = last = NULL;
  }
  void insert(int p, int r)
  {
    Node *newNode = new Node(p, r);
    Node *curr = first;
    Node *prev = curr;
    if(curr == NULL)
    {
     first = last = newNode;
      delete curr;
      delete prev;
    }
    else
    {
      while(curr != NULL && curr->Priority <= p)
      {
        prev = curr;
        curr = curr->next;
      }
      prev->next = newNode;
      newNode->previous = prev;
      newNode->next = curr;
    }
  }
  void pop()
  {
    Node *tmp = first;
    while(tmp->next->next != NULL)
    {
      tmp = tmp->next;
    }
    tmp->next = NULL;
    last = tmp;
  }
 
  void display()
  {
    Node *tmp = first;
    while(tmp != NULL)
    {
      cout << "Priority :" << tmp->Priority << endl;
      cout << "Roll Number :" << tmp->roll_number << endl;
      tmp = tmp->next;
    }
  }
};
int main()
{
  d_link_list d;
 int choice;
 int priority,roll_no;
  cout << "\t\tPriority Queue Implementation using Linked List" << endl << endl;
 do{
   cout<<"\n************Menu Priority Queue*******";
   cout<<"\n1)To add a student";
   cout<<"\n2)To remove the student";
   cout<<"\n3)Display all student with Priority";
   cout<<"\n4)Exit";
    cout<<"\n######################################";
    cout<<"\n Enter your choice";
    cin>>choice;
   switch(choice)
   {
     case 1:
     cout<<"\n Enter Roll no with Priority";
     cin>>roll_no>>priority;
     d.insert(priority, roll_no);
     cout<<"\n inserted";
     break;
     case 2:
      d.pop();
     break;
     case 3:
     d.display();
     break;
     case 4:
     break;
     default:
     cout<<"\n Please enter proper value";
   }
 }while(choice!=4);
  return 0;
}
#include<iostream>
using namespace std;
class node
{
   public:
       int data;
       node* next;
       node* prev;
};
class Dequey{
public:
       node* newnode;
       node* temp;
       node* head;
       node* tail;
       int i,n;
    void create_node(){
       newnode = new node();
       cout<<"\n Enter data to be inseted:";
       cin>>newnode->data;
       newnode->next = NULL;
       newnode->prev = NULL;
   }
   void init(){
       head = NULL;
       tail = NULL;
       cout<<"Enter Data of First NODE"<<endl;
       create_node();
       head = newnode;
       tail = newnode;
   }
   void insertion_end(){
       create_node();
       newnode->prev = tail;
       tail->next = newnode;
       tail = tail->next;
   }
   void deletion_beg(){
       head = head->next;
   }
   void deletion_end(){
       tail = tail->prev;
       tail->next = NULL;
   }
   void display()
   {
       temp = head;
       if(temp!=tail){
       while(temp != tail){     
           cout<<temp->data<<" ";
           temp = temp->next;
       }}
       else{
         cout<<temp->data<<" ";
          temp = temp->next;
       }
   }
 void  insertion_beg();
};
void Dequey::insertion_beg(){
       create_node();
       newnode->next = head;
       head->prev= newnode;
       head = head->prev;
   }
int main(){
   Dequey d;
   int choice=0,flag=0;
    d.init();
   do{
     cout<<"\n***********DQUEUE*****************";
       cout<<endl<<"1. Insertion at Beg \n2. Insertion at End \n3. Deletion at Beg \n4. Deletion at End \n5. Display all \n 6.Exit"<<endl;
       cout<<"\n################################\n";
       cout<<"\n Enter your choice:";
       cin>>choice;
       switch(choice){
       case 1:
           d.insertion_beg();
           break;
       case 2:
           d.insertion_end();
           break;
       case 3:
           d.deletion_beg();
           break;
       case 4:
           d.deletion_end();
           break;
       case 5:
       d.display();
           break;
       case 6:
       break;
       default:
       cout<<"\n Please enter a valid choice";
       }
 }while(choice !=6);
   d.display();
   return 0;
}

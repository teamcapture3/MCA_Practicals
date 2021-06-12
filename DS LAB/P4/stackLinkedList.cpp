#include<iostream>
#include<process.h>
#include<conio.h>
#include<stdlib.h>
using namespace std;
struct node
{
    int data;
    struct node *next;
};
class stack
{
    struct node *top;
    public:
    stack()
    {
	top=NULL;
    }
    void push();
    void pop();
    void peak();
    void show();
};
void stack::push()
{
    int value;
    struct node *ptr;
    cout<<"\nPUSH Operationn";
    cout<<"Enter a number to insert: ";
    cin>>value;
    ptr=new node;
    ptr->data=value;
    ptr->next=NULL;
    if(top!=NULL)
	ptr->next=top;
    top=ptr;
    cout<<"\nNew item is inserted to the stack!!!";

}
void stack::pop()
{
    struct node *temp;
    if(top==NULL)
    {
	cout<<"\nThe stack is empty!!!";
    }
    temp=top;
    top=top->next;
    cout<<"\nPOP Operation........\nPoped value is "<<temp->data;
    delete temp;
}
void stack::peak()
{
    struct node *temp;
    if(top==NULL)
    {
	cout<<"\nThe stack is empty!!!";
    }
    temp=top;
    cout<<"\nPEAK Operation........Top value is "<<temp->data;
}
void stack::show()
{
    struct node *ptr1=top;
    cout<<"\nThe stack is\n";
    while(ptr1!=NULL)
    {
	cout<<ptr1->data<<" ->";
	ptr1=ptr1->next;
    }
    cout<<"NULL\n";
}
int main()
{
    stack s;
    int choice;
    while(1)
    {
        cout<<"\n-----------------------------------------------------------";
        cout<<"\nSTACK USING LINKED LIST\n";
        cout<<"1:PUSH 2:POP 3:DISPLAY STACK 4:PEAK 5:EXIT ";
        cout<<"\n Enter your choice(1-5): ";
        cin>>choice;
        switch(choice)
        {
            case 1:
            s.push();
            break;
            case 2:
            s.pop();
            break;
            case 3:
            s.show();
            break;
            case 4:
            s.peak();
            break;
            case 5:
            exit(0);
            break;
            default:
            cout<<"Please enter correct choice(1-5)!!";
            break;
        }
    }
}

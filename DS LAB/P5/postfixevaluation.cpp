#include <iostream>
#include<math.h>
using namespace std;
int top=-1;
int stk[20];
void push(int x)
{
if(top<20)
{
stk[++top]=x;
}
else
{
cout<<"\nStack is full";
}
}
int pop(int y)
{
int x;
x=stk[y];
top--;
return x;
}
int main()
{
cout << "Postfix evaluation!!!\n";
char arr[20];
char *p=arr;
cout<<"\nEnter Postfix Expression : ";
cin>>arr;
int temp;
while(*p!='\0')
{
if(isalnum(*p))
{
push(*p-48);
}
else if(*p=='+')
{
temp=pop(top)+pop(top);
push(temp);
}
else if(*p=='-')
{
temp=pop(top-1)-pop(top+1);
push(temp);
}
else if(*p=='*')
{
temp=pop(top)*pop(top);
push(temp);
}
else if(*p=='/')
{
temp=pop(top-1)/pop(top+1);
push(temp);
}
else if(*p=='^')
{
temp=pow(pop(top-1),pop(top));
push(temp);
}
p++;
}
while(top!=-1)
{
cout<<"\nPostfix evaluated result is "<<stk[top]; top--;
}
}

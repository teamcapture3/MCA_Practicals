#include <iostream>
#include<math.h>
using namespace std;
int top1=-1;
class stack
{
public:
int stk[20];
void push(int x)
{
if(top1<20)
{
stk[++top1]=x;
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
top1--;
return x;
}
int top()
{
return stk[top1];
}
};
bool isOperand(char c)
{
return isdigit(c);  }
int evaluatePrefix(string exprsn)
{
stack Stack;
for (int j = exprsn.size() - 1; j >= 0; j--) {
if (isOperand(exprsn[j]))
Stack.push(exprsn[j] - '0');
else {
int o1 = Stack.top();
Stack.pop(exprsn[j]);
int o2 = Stack.top();
Stack.pop(exprsn[j]);
switch (exprsn[j]) {
case '+':
Stack.push(o1 + o2);
break;
case '-':
Stack.push(o1 - o2);
break;
case '*':
Stack.push(o1 * o2);
break;
case '/':
Stack.push(o1 / o2);
break;
case '^':
Stack.push(pow(o1 , o2));
break;
}
}
}
return Stack.top();
}
int main()
{
string exprsn;
cout<<"Prefix evaluation\n";
cout<<"Enter prefix expression : ";
cin>>exprsn;
cout <<"Evaluated prefix expression is : "<<evaluatePrefix(exprsn);
return 0;
}

#include <iostream>
#include<algorithm>
#include<stack>
#include<math.h>
using namespace std;

string infixToPostfix(string infix);

int isoperand(char symbol)
{
  if(symbol>='a'&&symbol<='z')
  return 1;
  else
  return 0;
}

int isoperator(char symbol)
{
  if(symbol=='+'||symbol=='-'||symbol=='*'||symbol=='/'||symbol=='^')
  return 1;
  else
  return 0;
}

int isprecedence(char symbol)
{
  int result=0;
  switch(symbol)
  {
    case '{':
    result=0;
    break;
    case '+':
    case '-':
    result=1;
    break;
    case '*':
    case '/':
    result=2;
    break;
    case '^':
    result=3;
    break;
  }
  return result;
}

string infixToPostfix(string infix)
{
  stack<char> s;
  char smbl;
  string postfix;
  s.push('(');
  for(int i=0;i<infix.length();i++)
  {
    smbl=infix[i];
    if(isoperand(smbl))
    {
      postfix += smbl;
    }

    if(smbl=='(')
    {
      s.push(smbl);
    }
    if(isoperator(smbl))
    {
      while(isprecedence(s.top())>=isprecedence(smbl))
      {
        postfix += s.top();
        s.pop();
      }
      s.push(smbl);
    }

    if(smbl==')')
    {
      while(s.top()!='(')
      {
        postfix += s.top();
        s.pop();
      }
      s.pop();
    }
  }

  while(s.top()!='(')
  {
    postfix += s.top();
    s.pop();
  }
  return postfix;
}

int main()
{
  cout<<"Infix to postfix conversion !!!\n";
  cout<<"\nEnter an infix expression : ";
  string infix;
  cin>>infix;
  cout<<"\nPostfix expression is "<<infixToPostfix(infix);
}

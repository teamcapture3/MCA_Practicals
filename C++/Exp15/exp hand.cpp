#include<iostream>
using namespace std;
const int MAX=3;
class stack
{
    int st[MAX];
    int top;
public:
    class lrange
    {
    };
    class urange
    {
    };
    stack()
    {
        top=-1;
    }
    void push(int var)
    {
        if(top>=MAX-1)
        {
            throw urange();
        }
        else
        {
            st[++top]=var;
        }
    }
    int pop()
    {
        if(top<0)
        {
            throw lrange();
        }
        else
        {
            return st[top--];
        }
    }
};
int main()
{
    stack s1;
    try
    {
        s1.push(11);
        s1.push(22);
        s1.push(33);
        cout<<"1:"<<s1.pop()<<endl;
        cout<<"2:"<<s1.pop()<<endl;
        cout<<"3:"<<s1.pop()<<endl;
        cout<<"4:"<<s1.pop()<<endl;
    }
    catch(stack::lrange)
    {
        cout<<"Exception:Stack Empty"<<endl;
    }
    catch(stack::urange)
    {
        cout<<"Exception:Stack Full"<<endl;
    }
    return 0;
}

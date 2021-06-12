#include<iostream>
using namespace std;
class Time
{
    int hour, minute;
public:
    Time()
    {
        hour = minute = 0;
    }
    Time(int h, int m)
    {
        hour = h;
        minute = m;
    }
    void display()
    {
        cout<<"\nHours: "<<hour;
        cout<<"\nMinutes: "<<minute;
    }
};
int main()
{
    Time t;
    Time t1(3,33);
    t.display();
    t1.display();

    return 0;
}

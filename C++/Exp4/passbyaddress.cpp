#include<iostream>
using namespace std;
void swap(int &x, int &y)
{
    int temp;
    temp = x;
    x = y;
    y = temp;
}
int main()
{
    int x = 100;
    int y = 200;
    cout<<"Value of x before swapping: "<<x<<endl;
    cout<<"Value of y before swapping: "<<y<<endl;
    swap(x,y);
    cout<<endl;
    cout<<"Value of x after swapping: "<<x<<endl;
    cout<<"Value of y after swapping: "<<y<<endl;
    return 0;
}

#include<iostream>
using namespace std;
template<class T,class L>
void avg(T const* arr,L sz)
{
    T sum=0;
    T avg=0;
    for(int i=0;i<sz;i++)
    {
        sum=sum+arr[i];
    }
    avg=sum/sz;
    cout<<"\nAverage is:"<<avg<<endl;
}
int main()
{
    double arr[5];
    cout<<"\nEnter 3 double elements"<<endl;
    for(int i=0;i<3;i++)
    {
        cin>>arr[i];
    }
    avg(arr,3);
    int ar[5];
    cout<<"\nEnter 3 integer elements"<<endl;
    for(int i=0;i<3;i++)
    {
        cin>>ar[i];
    }
    avg(ar,3);
    return 0;
}

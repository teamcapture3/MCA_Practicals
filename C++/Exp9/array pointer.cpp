#include<iostream>
using namespace std;
const int MAX=5;
int main()
{
    int var[MAX]={10,20,30,40,50};
    int *ptr[MAX];
    for(int i=0;i<MAX;i++)
    ptr[i]=&var[i];
    for(int i=0;i<MAX;i++)
    {
        cout<<"Address of var ["<<i <<"]= ";
        cout<<*ptr[i]<<endl;
    }
    return 0;
}

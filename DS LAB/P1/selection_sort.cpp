#include<iostream>
using namespace std;
const int m=4;
int main()
{
    int data[m],i,j,k,min,minindex,n;
    cout<<"Enter the number of values:" << endl;
    cin>>n;
    cout<<"Enter the values: " << endl;
    for(i=0;i<n;i++)
    cin>>data[i];
    cout<<endl;
    cout<<"List to be sorted: " << endl;
    for(i=0;i<n;i++)
    cout<<data[i]<<" ";
    cout<<endl;
    cout<<"\nSelection Sort: " << endl;
    for(i=0;i<n;i++)
    {
        minindex=i;
        min=data[i];
        for(j=i+1;j<n;j++)
        {
            if(min>data[j])
            {
                minindex=j;
                min=data[j];
        }
    }
    data[minindex]=data[i];
    data[i]=min;
    cout << endl << "Pass "<< i+1 <<":";
    for(k=0;k<n;k++)
    cout<<" "<<data[k];
    cout<<endl;
    }
}

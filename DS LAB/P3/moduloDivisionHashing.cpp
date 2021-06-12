#include <iostream>
using namespace std;
void mod(int k[],int s,int ls[],int l)
{
    int temp,c=0;
    for(int i=0;i<s;i++)
    {
        temp=(k[i]%l)+1;
        if(ls[temp]==0)
        {
            ls[temp]=k[i];
            c++;
        }
        else
        {
            cout<<"\nCollision occurred at position "<<temp<<" with key "<<k[i];
            while(ls[temp]!=0)
            {       temp++;            }
            cout<<"\nTo resolve collision we have incremented the position to "<<temp<<endl;
            ls[temp]=k[i];
            c++;
        }
    }
    cout<<"\nAfter positioning:\n";
    for(int j=1;j<=l;j++)
    {
        cout<<"\nElement at position "<<j<<": ";
        cout<<ls[j];
    }
    cout<<"\n\nLoad factor is "<<(float(c)/l)*100;
}
int main()
{
    cout<<"Hashing algorithm\n";
    int s,l;    
    cout<<"\nEnter array size : ";
    cin>>s;
    int k[s];
    cout<<"\nEnter elements\n";
    for(int i=0;i<s;i++)
    {        cin>>k[i];    }
    cout<<"\nEnter hash table size : ";
    cin>>l;
    int ls[l];
    for(int j=0;j<l;j++)
    {
        ls[j]=0;
    }
    mod(k,s,ls,l);
    return 0;
}

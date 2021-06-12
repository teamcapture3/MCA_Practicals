#include<iostream>
using namespace std;
class matrix
{
    public:
    int a[2][2];
    matrix()
    {
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                a[i][j]=0;
            }
        }
    }
    void set()
    {
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                cout<<"Enter the elements:"<<endl;
                cin>>a[i][j];
            }
        }
    }
    void show()
    {
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                cout<<a[i][j]<<"\t";
            }
	   cout<<"\n";
        }
    }
    matrix operator*(matrix x)
    {
        matrix c;
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                c.a[i][j]=0;
                for(int k=0;k<2;k++)
                {
                    c.a[i][j]=c.a[i][j]+a[i][k]*x.a[k][j];
                }
            }
        }
        return(c);
    }
};
int main()
{
    matrix a,b,c;
    a.set();
    cout<<"The First Matrix is:"<<endl;
    a.show();
    b.set();
    cout<<"The Second Matrix is:"<<endl;
    b.show();
    c=a*b;
    cout<<"The Multiplication of the Matrix is:"<<endl;
    c.show();
    return 0;
}

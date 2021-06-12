#include <iostream>
using namespace std;
int partition(int a[],int start ,int last);
void quickSort(int a[],int start, int last)
{
    if(start<last)
    {
        int part;
        part=partition(a,start,last);
        quickSort(a,start,part);
        quickSort(a,part+1,last);

    }
}
int partition(int a[], int start, int last)
{
    int i,j,pivot,temp;
    pivot=a[start];
    i=start;
    j=last;
    while(1)
    {
        while(a[i]<pivot && a[i]!=pivot)
        {
            i++;
        }
        while(a[j]>pivot && a[j]!=pivot)
        {
            j--;
        }
        if(i<j)
        {
            temp=a[i];
            a[i]=a[j];
            a[j]=temp;
        }
        else
        {
            return j;
        }
    }
}
void printArray(int ar[], int size)
{
    int i;
    for (i = 0; i < size; i++)
    cout << ar[i] << " ";
    cout << endl;
}
int main()
{
    int num;
    cout<<"\n Enter the number of array elements: ";
    cin>>num;
    int a[num];
    for(int i=0;i<num;i++)
    {
        cout<<"\n Enter at position "<<i<<":";
        cin>>a[i];
        cout<<endl;
    }
   int start=0;
   int last=num-1;
   quickSort(a,start,last);
   printArray(a,num);
   return 0;
}

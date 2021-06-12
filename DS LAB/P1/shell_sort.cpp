#include <iostream>
using namespace std;
int shellSort(int arr[], int n)
{
    for (int gap = n/2; gap > 0; gap /= 2)
    {
        for (int i = gap; i < n; i += 1)
        {
            int temp = arr[i];
            int j;
            for (j = i; j >= gap && arr[j - gap] > temp; j -= gap)
            arr[j] = arr[j - gap];
            arr[j] = temp;
        }
    }
    return 0;
}
void printArray(int arr[], int n)
{
    int i;
    for (int i=0; i<n; i++)
    cout << arr[i] << " ";
    cout << endl;
}
int main()
{
   int n;
   cout << "Enter the number of elements: ";
   cin >> n;
   int arr[n];
   for(int i = 0; i<n; i++) {
   	cout<<"Enter the values: " << endl;
   	for(i=0;i<n;i++)
    cin>>arr[i];
    cout<<endl;
   }
   	cout<<"Unsorted Array: \n";
   	printArray(arr,n);cout<<endl;
    shellSort(arr, n);
    cout<<endl;
	cout<<"Sorted Array: \n";
    printArray(arr, n);

    return 0;
}

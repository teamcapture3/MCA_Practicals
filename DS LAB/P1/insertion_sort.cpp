using namespace std;
#include<iostream>
void insertionSort(int arr[], int n)
{
    int i, key, j;
    for (i = 1; i < n; i++)
    {
        key = arr[i];
        j = i - 1;
  		cout<<"Swaping "<<arr[j]<<" and "<<arr[i]<<endl;
        while (j >= 0 && arr[j] > key)
        {
            arr[j + 1] = arr[j];
            j = j - 1;
        }
        cout<<endl;
        arr[j + 1] = key;
		cout<<"Semi Sorted Array: \n";
       for(int k=0;k<n;k++){
       	cout<<arr[k]<<" ";
	   }
	   cout<<endl;
    }
}
void printArray(int arr[], int n)
{
    int i;
    for (i = 0; i < n; i++)
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
    insertionSort(arr, n);
    cout<<endl;
	cout<<"Sorted Array: \n";
    printArray(arr, n);

    return 0;
}

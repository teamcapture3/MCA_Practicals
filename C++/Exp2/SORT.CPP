//exp2 g)sorting array
#include<iostream.h>
#include<conio.h>
void main()
{
	clrscr();
	int arr[5], i, j, tmp;
	cout << "Enter 5 Numbers" << "\n\n";
	for (i = 0; i < 5; i++)
	{
		cout << "Number " << i+1 << ":";
		cin >> arr[i];
	}
	for (i = 0; i < 5; i++)
	{
		for (j = i + 1; j < 5; j++)
		{
			if (arr[i] > arr[j])
			{
				tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
			}
		}
	}
	cout << "\n\nSorted in Ascending Order :" << "\n\n";
	for (i = 0; i < 5; i++)
	{
		cout << arr[i] << "\t";
	}
	getch();
}
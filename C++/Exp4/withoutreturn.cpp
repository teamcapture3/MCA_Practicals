//exp 4 b)Without Return Type
#include<iostream>
using namespace std;

void reverse(int number){
	int reversedNumber=0;
	int temp1 =number,temp;
	while(number !=0)
	{
		temp = number%10;
		reversedNumber = (reversedNumber*10)+temp;
		number = number/10;
	}
	cout<<"\n Reverse of "<<temp1<<" is "<<reversedNumber;
}
int main()
{
	int number;
	cout<<"\n Enter a number: ";
	cin>>number;
	reverse(number);

	return 0;
}

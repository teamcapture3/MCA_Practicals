//exp 4 b)With Return Type
#include<iostream>
using namespace std;

int reverse(int number){
	int reversedNumber=0;
	int temp;
	while(number !=0)
	{
		temp = number%10;
		reversedNumber = (reversedNumber*10)+temp;
		number = number/10;
	}
	return reversedNumber;
}
int main()
{
	int number;
	cout<<"\n Enter a number";
	cin>>number;
	int rever=reverse(number);
	cout<<"\n Reverse of "<<number<<" is "<<rever;
	return 0;
}

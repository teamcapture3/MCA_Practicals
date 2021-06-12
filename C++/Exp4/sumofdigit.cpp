#include<iostream>
using namespace std;
int sumOfDigitReducedToOneDigit(int num)
{
	int sum;
	int temp;
	if(num <9)
	{
		return num;
	}
	else{
	while(num !=0)
	{
		sum += num%10;
		 num /=10;
	}
	if(sum >9){
		sumOfDigitReducedToOneDigit(sum);
	}else{
		return sum;
	}

}

}
int main()
{

	int number;
	cout<<"\nEnter the number:";
	cin>>number;
	cout<<"Answer=>"<<sumOfDigitReducedToOneDigit(number);
	return 0;
}

#include<iostream>
#include<stdio.h>
using namespace std;
int main()
{
	char str[20];
	int i,count=1;
	cout<<"Enter a string: ";
	gets(str);
	for(i=0;str[i]!='\0';++i)
	{
		if(str[i]==' ')
        count++;
	}
	cout<<"\nThere are "<<count<<" words in the given string.";
	return 0;
}

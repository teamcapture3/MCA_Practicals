//exp2 a) Prime No
#include<iostream.h>
#include<conio.h>
void main()
{
	clrscr();
	int i,p,n,j;
	for(i=1;i<=100;i++)
	{
		n=i;p=1;j=2;
		while(j<=n/2)
		{
			if(n%j==0)
			{
				p=0;
				break;
			}
			j++;
		}
		if(p==1)
		cout<<n<<"\t";
	}
	getch();
}
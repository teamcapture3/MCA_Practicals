#include<iostream>
#include<math.h>
#define PI 3.14
using namespace std;

float area(float dim1,float dim2){
	float area;
	area=dim1*dim2;
	cout<<"The Area of Rectangle is: "<<area<<endl;
}

float area(float dim1,float dim2,float dim3){
	float s,area;
	s=dim1+dim2+dim3/2;
	area=sqrt(s*(s-dim1)*(s-dim2)*(s-dim3));
	cout<<"The Area of Triangle is: "<<area<<endl;
}

float area(float dim1){
	float area;
    area=PI*dim1*dim1;
    cout<<"The area of Cirle is:"<<area<<endl;
}

int main(){
	int ch;
	float d1,d2,d3;

	while(ch!=0){
		cout<<"1:Rectangle\n";
        cout<<"2:Triangle\n";
        cout<<"3:Circle\n";
        cout<<"4:Exit\n";
        cout<<"Enter any one choice to continue: \n";
        cin >> ch;
        switch(ch){
        	case 1:
        		cout<<"Enter the dimensions of Rectangle:\n";
        		cin>>d1>>d2;
        		area(d1,d2);
        		break;
        	case 2:
        		cout<<"Enter the dimensions of Triangle:\n";
                cin>>d1>>d2>>d3;
                area(d1,d2,d3);
                break;
            case 3:
            	cout<<"Enter the dimensions of Circle:\n";
                cin>>d1;
                area(d1);
                break;
            case 4:
            	exit(0);
            default:
            	cout << "Wrong choice\n";
		}
	}
}
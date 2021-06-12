#include<iostream>
#include<conio.h>
#include<stdlib.h>
using namespace std;
class BankDemo{
  public:
    static long acn;
    long bal,wit,dep;
    BankDemo(){
      acn=0;
          bal=0;
          wit=0;
          dep=0;
    }
};

long BankDemo::acn; 

int main(){
  BankDemo obj;
  int ch;
  cout<<"Enter A/C number: ";
  cin >> obj.acn;
  while(1){
    cout<<"\n1. Deposit\n2. Withdraw\n3. Display\n4. Exit\n";
    cin>>ch;
    switch(ch)
        {
        case 1:
            cout<<"Enter the amount to be deposited: ";
                cin>>obj.dep;
                obj.bal=obj.bal+obj.dep;
                break;
        case 2:
            cout<<"Enter the amount to be withdrawn: ";
                cin>>obj.wit;
                obj.bal=obj.bal-obj.wit;
                break;
        case 3:
                cout<<"\nA/C No: "<<obj.acn;
                cout<<"\nBalance: "<<obj.bal<<endl;
                break;
        case 4:
                exit(0);
                break;
        default:
                cout<<"\nInvalid Option choosen..!!\n ";
        }
  }
}
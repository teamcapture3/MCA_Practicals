#include<iostream>
using namespace std;

 int vol(int length,int breadth,int height)
 {
  int volume;
  volume=length*breadth*height;
  return volume;
 }
 int main()
 {
 int length,breadth,height,volume;
 cout<<"Enter Length: ";
 cin>>length;
 cout<<"Enter Breadth: ";
 cin>>breadth;
 cout<<"Enter Height: ";
 cin>>height;
 int x=vol(length,breadth,height);

  cout<<"The Volume of the Cuboid is: "<<x<<endl;

 return 0;
}

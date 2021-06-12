#include<iostream>
#include<fstream>
#include<string>
#define FILE_NAME "person.dat"
using namespace std;
class person
{
      private:
              int age;
              string name;
      public:
             void readperson()
             {
                  cout<<"Person Details"<<endl;
                  cout<<"Enter the Age: ";
                  cin>>age;
                  cin.ignore(1);
                  cout<<"Enter the Person's Name: "<<endl;
                  cin>>name;

             }
             void displayperson()
             {
                  cout<<"Person's Age: "<<age<<endl;
                  cout<<"Persons's Name: "<<name<<endl;
             }
};
int main()
{
    person p;
    p.readperson();
    fstream file;
	file.open(FILE_NAME,ios::out|ios::binary);
	if(!file)
    {
             cout<<"Error in creating file...\n";
		     return -1;
	}
    file.write((char*)&p,sizeof(p));
	file.close();
	cout<<"Date saved into file the file.\n";
	//open file again
	file.open(FILE_NAME,ios::in|ios::binary);
	if(!file){
		cout<<"Error in opening file...\n";
		return -1;
	}
	if(file.read((char*)&p,sizeof(p))){
			cout<<endl<<endl;
			cout<<"Data extracted from file..\n";
			//print the object
			p.displayperson();
	}
	else{
		cout<<"Error in reading data from file...\n";
		return -1;
	}
	file.close();
	return 0;
}

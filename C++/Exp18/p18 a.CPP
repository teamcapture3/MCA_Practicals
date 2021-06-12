#include<iostream>
#include<fstream>
#define FILE_NAME "student.dat"
using namespace std;
class student
{
      private:
              int rollno;
              char address[100];
      public:
             void readstudent()
             {
                  cout<<"Student Details"<<endl;
                  cout<<"Enter the Roll.No:";
                  cin>>rollno;
                  cin.ignore(1);
                  cout<<"Enter the Student's Address"<<endl;
                  cin>>address;
                  cin.getline(address,100);
             }
             void displaystudent()
             {
                  cout<<"Student Roll.No:"<<rollno<<endl;
                  cout<<"Student's Address"<<address<<endl;
             }
};
int main()
{
    student stud;
    stud.readstudent();
    fstream file;
	file.open(FILE_NAME,ios::out|ios::binary);
	if(!file)
    {
             cout<<"Error in creating file...\n";
		     return -1;
	}
    file.write((char*)&stud,sizeof(stud));
	file.close();
	cout<<"Date saved into file.\n";
	//open file again
	file.open(FILE_NAME,ios::in|ios::binary);
	if(!file){
		cout<<"Error in opening file...\n";
		return -1;
	}
	if(file.read((char*)&stud,sizeof(stud))){
			cout<<endl<<endl;
			cout<<"Data extracted from file..\n";
			//print the object
			stud.displaystudent();
	}
	else{
		cout<<"Error in reading data from file...\n";
		return -1;
	}
	file.close();
	return 0;
}

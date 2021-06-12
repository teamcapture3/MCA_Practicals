#include<iostream>
#include<string.h>
using namespace std;
class Student
{
protected:
    string name;
    int roll_no;
public:
    void getdata(int roll, string n)
    {
        roll_no = roll;
        name = n;
    }
    void putdata()
    {
        cout<<"\nStudent Name: "<<name;
        cout<<"\nStudent Roll No: "<<roll_no;
    }
};
class Test: public Student
{
protected:
    int sub1, sub2, sub3;
public:
    void getmark(int s1, int s2, int s3)
    {
        sub1 = s1;
        sub2 = s2;
        sub3 = s3;
    }
    void putmark()
    {
        cout<<"\nSubject 1 Mark: "<<sub1;
        cout<<"\nSubject 2 Mark: "<<sub2;
        cout<<"\nSubject 3 Mark: "<<sub3;
    }
};
class Result: public Test
{
private:
    int total_marks;
public:
    void display()
    {
        putdata();
        putmark();
        total_marks = sub1+sub2+sub3;
        cout<<"\nTotal Marks: "<<total_marks;
    }
};

int main()
{
    Result obj;
    obj.getdata(48, "Siddhi");
    obj.getmark(70,75,80);
    obj.display();

    return 0;
}

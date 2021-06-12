#include<iostream>
#include<string.h>
using namespace std;
class Person
{
    int id;
    string name;
public:
    void get_person_details()
    {
        cout<<"\nEnter ID: ";
        cin>>id;
        cout<<"\nEnter Name: ";
        cin>>name;
    }
    void display_person_details()
    {
        cout<<"\nID: "<<id;
        cout<<"\nName: "<<name;
    }
};
class Teaching: public Person
{
    string sub_name;
    string teacher_name;
public:
    void get_teacher_details()
    {
        get_person_details();
        cout<<"\nEnter Subject Name: ";
        cin>>sub_name;
    }
    void display_teacher_details()
    {
        display_person_details();
        cout<<"\nSubject Name: "<<sub_name;
    }
};
class NonTeaching
{
    string dept_name;
public:
    void get_nonteching_details()
    {
        cout<<"\nEnter Department Name: ";
        cin>>dept_name;
    }
    void display_nonteaching_details()
    {
        cout<<"\nDepartment Name: "<<dept_name;
    }
};

class Instructor: public NonTeaching, public Teaching
{
public:
    void get_instructor_details()
    {
        get_teacher_details();
        get_nonteching_details();
    }
    void display_instructor_details()
    {
        display_teacher_details();
        display_nonteaching_details();
    }
};

int main()
{
    Instructor inst;
    inst.get_instructor_details();
    inst.display_instructor_details();
    return 0;
}

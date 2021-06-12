#include <iostream>
#include <windows.h>
#include <mysql.h>
using namespace std;
int main()
{
     MYSQL* conn;

     conn = mysql_init(0);

     conn = mysql_real_connect(conn,"localhost","root","","mca",0,NULL,0);

     if(conn)
        cout<<"connection to mca databse successful "<<endl;
     else
        cout<<"connection problem: "<<mysql_error(conn)<<endl;

    cout << "Hello world!" << endl;
    return 0;
}

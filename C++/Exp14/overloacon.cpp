#include<iostream>
using namespace std;
class Area
{
private:
    int length, breadth, side;
public:
    Area()
    {
        length = 0;
        breadth = 0;
        side = 0;
    }
    Area(int s)
    {
        side = s;
    }
    Area(int l, int b)
    {
        length = l;
        breadth = b;
    }
    Area(const Area &A)
    {
        side = A.side;
        length = A.length;
        breadth = A.breadth;
    }
    void area_square()
    {
        cout<<"\nArea of Square: "<<side*side;
    }
    void area_rectangle()
    {
        cout<<"\nArea of Rectangle: "<<length*breadth;
    }

};
int main()
{
    Area square(4);
    Area rectangle(20,30);
    Area area;
    square.area_square();
    rectangle.area_rectangle();

    area = square;
    area.area_square();

    return 0;
}

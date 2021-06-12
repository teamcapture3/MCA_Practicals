package JavaApplication;
abstract class dynamic
{
    float length;
    public dynamic(float l)
    {
        length=l;
    } 
    abstract void area();
}
class rectangle extends dynamic{
    float breadth;
    rectangle(float l, float b)
    {
        super(l);
        breadth=b;
    }
    public void area(){
        System.out.println("\nArea of rectangle:" +(length*breadth));
    }
}
class square extends dynamic{
    square(float l)
    {
        super(l);
    }
    public void area(){
        System.out.println("\nArea of square:" +(length*length));
    }
}
class circle extends dynamic{
    circle(float l)
    {
        super(l);
    }
    
    public void area(){
        System.out.println("\nArea of circle:" +(3.14*length*length));
    }
}
class ellipse extends dynamic{
    float b;
    ellipse(float l, float b)
    {
        super(l);
        this.b=b;
    }
    public void area(){
        System.out.println("\nArea of ellipse:" +(3.14*length*b));
    }
}
class triangle extends dynamic{
    float h;
    triangle(float l, float h)
    {
        super(l);
        this.h=h;
    }
    
    public void area()
    {
        System.out.println("\nArea of triangle:" +(length*h/2));
    }
}
class abstract_dispatch
{
	public static void main(String[] args)
    {	 rectangle obj=new rectangle(10.1F,20.2F);
        square objsquare=new square(40.5F);
        circle objcircle=new circle(15.5F);
        ellipse objellipse=new ellipse(55F,16.4F);
        triangle objtriangle=new triangle(80,44.4F);
       
 		dynamic ref;
        ref=obj; 
        ref.area();
        ref=objsquare;
        ref.area();
        ref=objcircle;
        ref.area();
        ref=objellipse;
        ref.area();
        ref=objtriangle;
        ref.area();
    }
}

public class InterfaceGeneric
{
	public static void main(String a[])
	{
		BoundInterface<Y> gcy = new BoundInterface<Y>(new Y());
		gcy.doRunTest();
		
		BoundInterface<Z> gcz = new BoundInterface<Z>(new Z());
		gcz.doRunTest();
	}
}
class BoundInterface<T extends X>
{
    private T objRef;
    public BoundInterface(T obj)
    {
        this.objRef = obj;
    }
    public void doRunTest()
    {
        this.objRef.printClass();
    }
}
interface X
{
    public void printClass();
}
class Y implements X
{
    public void printClass()
    {
        System.out.println("In class Y");
    }
}
class Z implements X{
    public void printClass(){
        System.out.println("In class Z");
    }
}

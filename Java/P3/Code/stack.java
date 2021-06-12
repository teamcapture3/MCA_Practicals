class stack
{
	int top,n;
    int stac[]=new int[10];
    void push(int n)
    {
        this.n=n;
        if(top>n-1)
        {
            System.out.println("\nStack overflow");
        }
        else
        {
            top++;
            stac[top]=n;
        }
    }
    void pop()
    {
        if(top<=-1)
        {
            System.out.println("\nStack underflow");
        }
        else
        {
            System.out.println(stac[top]);
            top--;
        }
    }
    void display()
    {
        if(top<=-1)
        {
            System.out.println("\nStack underflow");
        }
        else
        {
            for(int i=top;i>=0;i--)
            {
                System.out.println(stac[i]);
            }
        }
    }
}
class stack1
{
    public static void main(String[] args)
    {
        stack obj1=new stack();
        obj1.push(20);
        obj1.push(30);
        obj1.push(40);
        System.out.print("\nPushed elements are: ");
        obj1.display();
        System.out.print("\nPopped elements are: ");
        obj1.pop();
        obj1.pop();
        obj1.pop();
    }
}

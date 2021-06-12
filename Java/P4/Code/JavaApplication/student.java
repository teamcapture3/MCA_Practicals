package JavaApplication;
class student
{ 	String name, address;
    int id, grade, age;
    student(String name, String address, int grade,int id, int age)
    {	   this.name=name;
        this.address=address;
        this.grade=grade;
        this.id=id;
        this.age=age;
    }
    public void result() {
        System.out.println("\nName:" +name);
        System.out.println("Address:" +address);
        System.out.println("Grade:" +grade);
        System.out.println("Id:" +id);
        System.out.println("Age:" +age);
    }
    public boolean isPassed()
    { return true; }}
class under extends student
{
    under(String name, String address, int grade,int id, int age)
    {
        super(name,address,grade,id,age);
    }
    public boolean isPassed()
    { if((grade>0) && (grade<100))
        {      
            if (grade>=80)
            {
                System.out.println("passed in under graduation");
            }
            else
            {
                System.out.println("Failed in under graduation");
                System.exit(0);
            }
        }
        else
        {
            System.out.println("Grade should be between 0-100");    
        }return true; }   
 public void result()
    {		  System.out.println("\n\nName:" +name);
        System.out.println("Address:" +address);
        System.out.println("Grade:" +grade);
        System.out.println("Id:" +id);
        System.out.println("Age:" +age); }}
class graduate extends under
{
    graduate(String name, String address, int grade,int id, int age)
    {
        super(name,address,grade,id,age);
    }
    public boolean isPassed() {
        if((grade>0) && (grade<100))
        {    if (grade>=70){
                System.out.println("passed in under graduation");
            }
            else
            {
                System.out.println("Failed in under graduation");
            } }
        else
        {
            System.out.println("Grade should be between 0-100");    
        } return true; }
    public void result() {	   System.out.println("\n\nName:" +name);
        System.out.println("Address:" +address);
        System.out.println("Grade:" +grade);
        System.out.println("Id:" +id);
        System.out.println("Age:" +age);}}
class student1
{
	public static void main(String[] args)
	{
        student objstud=new student("Jon","Chembur",90,33,22);
        student s2= new under("Kiev","Kurla",84,12,23);
        student s1= new graduate("Mukul","Bandra",85,56,22);
        objstud.result();
        s2.result();
        s2.isPassed();
        s1.result();
        s1.isPassed();
    }
}

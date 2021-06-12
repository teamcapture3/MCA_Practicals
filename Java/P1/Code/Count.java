class Count
{ 
  static int noOfObjects = 0; 
  { 
    noOfObjects += 1; 
  } 
  public Count()
  { 
  } 
  public Count(int n) 
  { 
  } 
  public Count(String s) 
  { 
  } 
  public static void main(String args[]) 
  {
    Count t1 = new Count(); 
    Count t2 = new Count(5); 
    Count t3 = new Count("GFG");
    Count t4 = new Count("ABC"); 
    System.out.println("Number of object created: "+noOfObjects);
  } 
}

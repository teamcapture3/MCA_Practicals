import java.util.*;

public class Collection
{
	public static void main(String x[])
	{
		List<Integer> list = new ArrayList<Integer>();
		Stack<String> stack = new Stack<String>();
		Map<Integer, String> map = new HashMap<Integer, String>();
		list.add(46);
		list.add(16);
		list.add(52);
		list.add(25);
		System.out.print("List Collection Class:\n\nInteger in list: ");
		for(Integer a:list)
		System.out.print(a + " ");
		System.out.println("\nMax Value: "+ Collections.max(list));
		stack.push("Collection"); 
        stack.push("Class"); 
        stack.push("Java"); 
        System.out.println("\nStack Collection Class: \n");
        System.out.println("Initial Stack:"+ stack);
        stack.pop();
        System.out.println("New Stack:"+ stack);
        System.out.println("\nMap Collection Class: \n");
        map.put(31,"Jon");  
		map.put(34,"Raj");  
		map.put(32,"Tom");  
		map.put(33,"Hank");  
		map.forEach((num,str)->System.out.println(num + "-->" +str));
	}
}

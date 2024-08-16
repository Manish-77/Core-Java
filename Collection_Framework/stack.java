package Collection_Framework;
import java.util.*;

public class stack {

	public static void main(String[] args) 
	{
		Stack <String> a = new Stack<>();
		a.push("manish");
		a.push("Raj");
		a.push("riya");
		a.push("john");
		System.out.println(a);
		a.pop();
		System.out.println(a);
		
		a.add(2, "xyz");
		System.out.println(a);
		System.out.println(a.capacity());
		
	}

}

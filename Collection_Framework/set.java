package Collection_Framework;
import java.util.*;

public class set {

	public static void main(String[] args) 
	{
		
		Set <Integer> a = new LinkedHashSet<>(); //order of insertion.
		a.add(80);
		a.add(20);
		a.add(30);
		a.add(10);
		a.add(50);
		System.out.println(a);
		a.remove(10);
		System.out.println(a);
		System.out.println("=====================");
		
		Set <String> b = new HashSet<>();  //Unordered Set
		b.add("Manish");
		b.add("Aditya");
		b.add("Zeu");
		b.add("Nitin");
		System.out.println(b);
		System.out.println("====================");
		
		Set <Integer> c = new TreeSet <>();  //Ascending Order
		c.add(22);
		c.add(33);
		c.add(44);
		c.add(10);
		c.add(05);
		c.add(20);
		System.out.println(c);
		c.remove(33);
		c.add(30);
		System.out.println(c);
		
		

	}

}

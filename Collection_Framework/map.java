package Collection_Framework;
import java.util.*;

public class map {

	public static void main(String[] args) 
	{
		Map <Integer , String> a = new LinkedHashMap<>();
		a.put(1, "Manish");
		a.put(10,"Jui");
		a.put(5,"zue");
		a.put(4,"Raj");
		System.out.println(a);
		
		Map <Integer , String> b = new HashMap<>(a);
		System.out.println("HashMap will be ");
		System.out.println(b);
		
		
		Map <Integer , String> c = new TreeMap<>(b);
		System.out.println("TreeMap Will be :-");
		System.out.println(c);
		
		System.out.println(a.keySet());
		System.out.println(a.values());
		
		// For each loop
		for(Map.Entry<Integer, String> mobj : a.entrySet())
		{
		System.out.println(mobj);
		}
	}

}

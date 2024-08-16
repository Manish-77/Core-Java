package Collection_Framework;
import java.util.*;

public class list {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		List <Integer> a = new ArrayList<> ();
		System.out.println("Enter a Numbers :- ");
		for(int i=0; i<4; i++)
		{
			
			int b = s.nextInt();
			a.add(b);
		}
		System.out.println(a);
		a.remove(2);
		System.out.println(a.lastIndexOf(a));
		System.out.println(a);
		System.out.println("=================");
		
		List <String> s1 = new LinkedList<>();
		s1.add("Manish");
		s1.add("Sumit");
		s1.set(1, "Chaudhari");
		System.out.println(s1);
		System.out.println("=================");
		
		List <Integer> m = new Vector<>();
		m.add(101);
		m.add(425);
		m.add(111);
		m.add(1, 100);
		m.add(2, 200);
		System.out.println(m);
		
		for(int i:m)            //For each loop to print all elements.
		{
			System.out.print(i+" ");
		}
	}
}

package Collection_Framework;
import java.util.*;

public class queue {

	public static void main(String[] args)  
	{
		Queue <String> a = new LinkedList<>();
		a.add("Manish");
		a.add("Jui");
		a.add("Sumit");
		a.add("yash");
		a.add("John");
		System.out.println(a);
		
		a.remove();
		a.remove("Sumit");
		System.out.println(a);
		System.out.println(a.peek());

	}

}

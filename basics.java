package practice1;
import java.util.*;

public class basics {
	
	Scanner s = new Scanner(System.in);
	String name;
	int age;
	
	
	void info()
	{
		name = s.nextLine();
		age = s.nextInt();
		System.out.println(name +"\t is a best Employee. his age is \t is\n "+age);
	}

	
	
	public static void main(String[] args)
	{
		int a,b,c;
	    a = 2;
	    b = 3;
		c = a>b?a:b;
		System.out.println("the maximum value is:"+c);
	
		if(a<1 || a<0)
		{
			System.out.println("Manish");
		}
		else
		{
			System.out.println("Chaudhari");
		}
		
		basics b1 = new basics();
		b1.info();
		
		
	}

}

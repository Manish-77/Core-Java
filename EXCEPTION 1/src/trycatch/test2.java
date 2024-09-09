package trycatch;
import java.util.*;


public class test2 
{
	int a,b,c;
	
	public void m1()
	{
		try
		{
			Scanner s =new Scanner (System.in);
			System.out.println("Enter two Numbers :-- ");
			a = s.nextInt();
			b = s.nextInt();
			c = a/b;
			System.out.println(c);
		}
		catch(ArithmeticException s) 
		{
			System.out.println("Not a Valid Answer.");
			System.out.println(s.getMessage());
		}
		
	}

	
	public static void main(String[] args)
	{
		test2 z = new test2();
		z.m1();

	}

}

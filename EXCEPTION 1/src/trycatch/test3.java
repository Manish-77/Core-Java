package trycatch;
import java.util.*;



public class test3 
{
	
	public static void m2()
	{
		int a[] = { 1,2,3,4,5,6,7};
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter The Index:-");
		int b = s.nextInt();
		try
		{
			System.out.println(a[b]);
		}
		catch(ArrayIndexOutOfBoundsException z)
		{
			System.out.println(z.getMessage());
			System.out.println(z.getCause());
			System.out.println("INVALID INDEX.");
		}
	}
	public static void m3()
	{
		
		try
		{
			int a;
			Scanner s = new Scanner(System.in);
			System.out.println("Enter The data :-");
			a = s.nextInt();
			System.out.println(a);
		}
		catch(InputMismatchException z)
		{
			System.out.println("DATA TYPE IS MISMATCHED.");
			System.out.println(z.getMessage());
		    System.out.println(z.getLocalizedMessage()); 
		    System.out.println(z.getCause());
		}
	}

	public static void main(String[] args)
	{
		//m2();
		m3();
	}

}

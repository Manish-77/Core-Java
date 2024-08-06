package practice1;
import java.util.*;

public class prime 
{

	Scanner s = new Scanner(System.in);
	
	
	
	void primes()
	{
		System.out.println("Enter last limit of number :");
		int size = s.nextInt();
		for (int i=1; i<=size; i++)
		{
			int count = 0;
			for (int j=1; j<=i; j++)
			{
				
				if(i%j == 0)
				{
					count++;
				}	
			}
			if(count == 2)
			{
				System.out.println(i);
			}
		}
		System.out.println();

	}
	public static void main(String[] args) 
	{
		prime p = new prime();
		p.primes();
		
		
	}

}

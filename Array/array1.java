package DSA;
import  java.util.*;

public class array1 {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int a[] = {1,2,4,5,2,4,5,2};
		for (int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
		
		System.out.println("Enter size of Array:");
		int size = s.nextInt();
		int b[] = new int [size];
		System.out.println("Enter " +size+" elements");
		for (int i=0; i<b.length;i++)
		{
			b[i] = s.nextInt();
			
		}
		System.out.print("[");
		for (int i=0; i<b.length;i++)
		{
			System.out.print(b[i]+",");
		}
		System.out.println("]");
		
		// Finding Duplicate elements in the Array.
		System.out.println("Duplicate Element :");
		for(int i=0; i<b.length; i++)
		{
			for(int j=i+1; j<b.length; j++)
			{
				if(b[i] == b[j])
				{
				  System.out.print(b[i]+",");
				}
			}
		}
		System.out.println();
		
		// Searching element in the Array.
		int ser;
		System.out.println("Enter Element to be searched:");
		ser = s.nextInt();
		for (int i=0; i<b.length; i++)
		{
		  if(b[i] == ser)
		  {
			  System.out.println(ser+ " is found .At position "+i);
		  }		  
		}
		
		//Min-Max Elements of array.
		
		int min=b[0];
		int max=b[0];
			for (int j=1; j<b.length; j++)
			{
				if(b[j] < min)
				{
					min = b[j];
				}
				if(b[j] > max)
				{
					max = b[j];
				}
			}
			
		
		System.out.println("Minimum elem.:- "+min);
		System.out.println("Maximum elem.:- "+max);
		
		
		
		
		
		
		
	}
}

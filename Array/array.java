package DSA;
import java.lang.reflect.Array;
import java.util.*;

public class array 
{

	public static void main(String[] args) 
	{
		System.out.println("Shashi");
		String a[] = {"Manish", "man1245", "makash", "masha"};
		
		Arrays.sort(a);
		System.out.println();
		String x=a[0];
		String y = a[a.length-1];
		String ans = "";
		for (int i=0; i < Math.min(x.length(), y.length()); i++)
		{
			if(x.charAt(i) == y.charAt(i))
			{
				ans = ans + x.charAt(i);
				System.out.println(ans);
			}
			else
			{
				break;
			}
		}
		
			System.out.println(ans);
		
		
		
		
		
//		for(int i=0;i<a.length;i++) 
//		{
//			for(int j=0;j<a[i].length();j++)
//			{
//				System.out.println(a[i].charAt(j));
//			}
//		}
	}

}

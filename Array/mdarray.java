package DSA;
import java.util.*;
public class mdarray {
	public static void main(String[] args) 
	{
	  //2D Array
		Scanner s = new Scanner(System.in);
		System.out.println("Enter No.of Rows and Columns");
		int rows = s.nextInt();
		int cols = s.nextInt();
		int a[][] = new int[rows][cols];
		
		for (int i=0; i<rows; i++)
		{
			for(int j=0; j<cols; j++)
			{
				a[i][j] = s.nextInt();
			}
		}
		System.out.println("The Array will be ");		
		for (int i=0; i<rows; i++)
		{
			for(int j=0; j<cols; j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		int min = a[0][0];
		int max = a[0][0];
		
		for (int i=0; i<rows; i++)
		{
			for (int j=0; j<cols; j++)
			{
				if(a[i][j] <min)
				{
					min = a[i][j];
				}
				if(a[i][j] > max)
				{
					max = a[i][j];
				}
			}
		}
		System.out.println("Minimum Elements:- "+min);
		System.out.println("Maximum Elements:- "+max);
	}
}
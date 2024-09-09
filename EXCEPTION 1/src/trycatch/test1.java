package trycatch;

import java.util.Scanner;

public class test1 
{   
	int a,b,c;
	
	public static void m1()
    {
		
    
	try
	{
		int a=20,b=10,c;
		System.out.println("Inside a try block ");
		c = a/b;
		System.out.println(c);
	}
	
	catch(ArithmeticException a)
	  {
		
		System.out.println("NOT A VALID ANSWER.");
		System.out.println(a.getMessage());
	  }
	    System.out.println("Out of exception...!!!!!!!!!! ");
    }
	
	 
	

	public static void main(String[] args)
	{
		m1();

	}

}

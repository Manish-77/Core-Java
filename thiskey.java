package practice1;

import java.util.Scanner;

public class thiskey 
{
	
	int rno = 111;
	String name = "Chaudhari";
	{
		System.out.println(rno +name);
	}
	void m1(int rno , String name) 
	{
	  this.rno=rno;
	  this.name=name; 
	  System.out.println(rno + name);
	  System.out.println(this.rno + this.name);
	  
	}
	
//	int a = 10;
	
//	void add()
//	{
//		int a = 100;
//		this.a = a;
//		
//		System.out.println(a);
//	}
//	{
//	System.out.println(a);
//	}
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		thiskey t = new thiskey();
		int i = s.nextInt();
		String n = s.next();
		t.m1(i , n);
		
//		t.add();
//		thiskey t1 = new thiskey();
	}

}

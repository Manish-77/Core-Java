package practice1;

public class reversing {
	

	reversing()
	{
		System.out.println("Manish");
	}
	reversing(int p , int b)
	{
		System.out.println("Addition of p and b is "+ (p+b));
	}
	
	void reverse(int num)
	{
	  int x;
	  int y=0 ;
	  while (num != 0)
	  {
		  x = num %10;
		  y = y*10 + x;
		  
		  num = num/10;	      
	  }
	  System.out.println(y);
	}
	
	static int a;
	int add()
	{
		 a= 100;
		int c = a+10;
		return c;
	}
	  

	public static void main(String[] args)
	{
		
		reversing a = new reversing();
		a.reverse(1024);
		reversing r = new reversing(100 , 200);
		
		String s = "Manish";
		System.out.println(s.length());
		System.out.println(a.add());

	}

}

package practice1;

public class wrapper 
{
	
	public static void main(String[] args) 
	{
		//AutoBoxing
		Integer a = 100;
		Double b = 1.2;
		Character c = 'M';
		int a1 = a;
		System.out.println("a1="+a1);
		double b1 = b;
		System.out.println("b1="+b1);
		char c1 = c;
		System.out.println("c1="+c1);
		
		System.out.println("================");
		
		//Unboxing
		int x = 124;
		double d = 12.124;
		Integer x1 = x;
		System.out.println("x1=" +x1);
		Double d1 = d;
		System.out.println("d1="+d1);
		
	}

}

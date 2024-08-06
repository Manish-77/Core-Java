package practice1;

public class looping
{
	static void add()
	{
		System.out.println("I am static method.");
	}
	static int a = 10;
	static
	{
		System.out.println(a*10);
		System.out.println("Manish");
	}
	
	void add1(int...  nums)
	{
		int sum = 0;
	for(int num :nums)
	{  
		sum = sum + num;	
	}
	System.out.println(sum);	
	}

	public static void main(String[] args) 
	{
		looping a= new looping();
		add();
		int i = 0;
		while (i<=100)
		{
			if(i%20 == 0)
			{
				System.out.println(i);
			}
			i += 1;
		}
		a.add1(1,2,4,5,7);
		a.add1(4,2);
	}
}



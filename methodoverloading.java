package methodoverloading;

public class methodoverloading 
{
	void add()
	{
		System.out.println(100+200);
	}
	
	int add(int a , int b)
	{
		return a+b;
	}
	
	long add(long a , long b)
	{
		return a+b;
	}
	// All methods having same name but not configurations.
	
	public static void main(String[] args) 
	{
		methodoverloading m = new methodoverloading();
		System.out.println(m.add(12, 32));
		System.out.println(m.add(124871242, 11111110));
		m.add();
	}
}

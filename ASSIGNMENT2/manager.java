package ASSIGNMENT2;

public class manager extends employee implements person
{
	double salary;
    String name = "MANISH CHAUDHARI ";
    String post = "Manager";
	String exp = "8 yrs";
	
	@Override
	public void info() 
	{
	    System.out.println("NAME :--   "+name);
		System.out.println("POST :--  " +post);
	    System.out.println("EXPERIENCE:-- "+exp);

	}

	@Override
	public void salary()
	{
		int perday = 7000;
		int day = 30;
		int bonus = 30000;
		int allowance = 8000;
		
		salary = (perday * day) + bonus + allowance;
		System.out.println("MANAGER'S SALARY IS  "+ salary);
	}

	@Override
	public void display() 
	{
		System.out.println("DISPLAYING THE INFORMATION OF MANAGER");

		
	}
	

}

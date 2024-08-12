package ASSIGNMENT1;

public class sportsman extends person
{
	double permatch = 50000;
	int noofmatches = 15;
	double salary;
	sportsman()
	{
		System.out.println("I AM A SPORTSMAN");
	}
	
	
	public void display()
	{
		System.out.println("SALARY OF SPORTSMAN IS: "+salary);
	}


	@Override
	public void salary()
	{
		salary = permatch*noofmatches;
	    
	}
	
}

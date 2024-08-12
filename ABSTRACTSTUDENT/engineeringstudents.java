package ABSTRACTSTUDENT;


public class engineeringstudents extends student
{
	
	
	engineeringstudents()
	{
		super(100);   // parent constructor using super keyword.
		System.out.println("I am in Child Class");
	}
	
	
	@Override
	public void exam() 
	{
		
		System.out.println("Exam for engineering students");
		
	}

	@Override
	public void project()
	{
		System.out.println("Project of Engineering students.");
		
		
	}
	 
	public void dresscode()
	{
		System.out.println("No Dresscode.");
	}
	
	public void assignments()
	{
		System.out.println("Toooo Many Assignments........");
	}
	

}


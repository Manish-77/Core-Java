package ASSIGNMENT2;

public class clerk extends employee implements person 
{
	double salary;
    String name = "SHUBHAM PATIL ";
    String post = "CLERK";
	String exp = "2 YRS";

	@Override
	public void info() 
	{
		System.out.println("NAME :-- "+name);
        System.out.println("POST :-- "+post);
		System.out.println("EXPERIENCE :-- "+exp);
		
	}

	@Override
	public void salary() 
	{
       int perday = 800;
       int day = 30;
       int bonus = 5000;
       int allowance = 1000;
       salary = (perday * day) + bonus + allowance;	
       System.out.println("CLERK'S SALARY IS :-- "+salary);
	}

	@Override
	public void display() 
	{
		System.out.println("DISPLAYING THE INFORMATION OF CLERK");
	}

}

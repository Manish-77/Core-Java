 package ABSTRACTSTUDENT;

 
 
 // Example Of Abstraction
 
 
public abstract class student 
{
	public abstract void exam();
	public abstract void project();
	
	
	student()
	{
		 System.out.println("I am in parent.");
	}
	
	student(int id)
	{
		System.out.println("ID is "+id);
	}
	
	// CONCRETE METHOD 
	
	public void knowledge()
	{
		System.out.println("INTEREST IN STUDY == KNOWLEDGE");
	}
	 
	 

}

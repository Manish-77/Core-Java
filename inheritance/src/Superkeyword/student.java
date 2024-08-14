package Superkeyword;

public class student extends person
   {
    int roll=13;
 	String name="Jui";
 	String Dept="IT";
 	
	public void info()
	{
		System.out.println(roll+" "+name+" "+Dept);
		System.out.println(super.roll+" "+super.name+" "+super.Dept);
		System.out.println("           ");
		super.info();
	}
	
}


package ASSIGNMENT2;

public class main {

	public static void main(String[] args)
	{
		manager m = new manager();
		m.display();
		m.info();
        m.salary();
        System.out.println("============================================");
        
        clerk c = new clerk ();
        c.display();
        c.info();
        c.salary();
        
	}

}

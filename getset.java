package Encapsulation;


/* Getter and setter are used to perform Encapsulation.
 */
public class getset 
{
	private int a =10;
	private String name = "Manish" ;

	public int getA() 
	{
		return a;
	}
	
	public void setA(int a) 
	{
		this.a = a;
	}

	public String getName() 
	{
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}

	@Override
	public String toString()
	{
		return "getset [a=" + a +  ", name=" + name + "]";
	}

	public static void main(String[] args) 
	{
		getset m = new getset ();
		m.setA(55);
		
		m.setName("Mnayaa");
		System.out.println(m.getA());
		System.out.println(m);

	}

}

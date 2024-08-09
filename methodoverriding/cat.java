package methodoverriding;

public class cat extends animals
{
	void sound()
	{
		System.out.println("Cat sound is Meow.");
	}
	
	void eat()
	{
		System.out.println("cat eats fish and rat.");
	}

	public static void main(String[] args) 
	{
		cat c = new cat();
		c.sound();
		c.eat();
		System.out.println("====================");
		dog d = new dog();
		d.sound();
		d.eat();
		System.out.println("====================");
		animals a = new animals();
		a.eat();
		a.sound();
		System.out.println("====================");
	}

}

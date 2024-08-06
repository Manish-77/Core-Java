package practice1;

public class sum 
{
	void avg()
	{
		int sume = 0, sumo = 0;
		int counte=0 , counto=0;
		for (int i=0; i<=100; i++)
		{
			if(i%2 == 0)
			{
				counte++;
				sume = sume +i;
			}
			else	
			{
			  counto++;
			  sumo = sumo +i;
			}
		}
		System.out.println("Sum of even numbers is :"+sume);
		System.out.println("Average of even numbers is :"+(sume/counte));
		System.out.println("Sum of odd numbers is :"+sumo);
		System.out.println("Average of odd numbers is :"+(sumo/counto));
		System.out.println(counte+" Even Numbers. \n"+counto+" Odd numbers.");
	}

	public static void main(String[] args) 
	{
		sum s = new sum();
		s.avg();

	}

}

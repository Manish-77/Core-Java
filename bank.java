package practice1;
import java.util.*;

public class bank 
{
	float amt = 5000;
	Scanner s = new Scanner (System.in);

	bank ()
	{
	   System.out.println("Your balance is "+amt);
	}
	
	void deposit()
	{
		System.out.println("Enter Amount you want to deposit.");
		float amtd = s.nextFloat();
		System.out.println("Amount deposited successfully.");
		amt = amt+amtd;
		System.out.println("Your balannce is "+amt);
	}
	
	void withdraw()
	{
		System.out.println("Enter Amount you want to withdraw.");
		float amtw = s.nextFloat();
		if (amtw <=amt)
		{
		amt = amt-amtw;
		System.out.println("Amount Withdrawn successfully");
		}
		else
		{
			System.out.println("Insufficient Bank Balance.");
		}
		
		System.out.println("Your Balance is "+amt);
	}
	
	
	
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		bank b = new bank();
		while (true)
		{
			System.out.println("Enter Your choice :");
			System.out.println("1. Deposit \n 2.Withdraw \n 3.Exit");
		
			int a = s1.nextInt();
			switch (a)
			{
				case 1:
					b.deposit();
					break;
				case 2:
					b.withdraw();
					break;
				case 3:
					System.out.println("Thank you !");
					System.exit(0);
					break;
				default:
					System.out.println("Enter Valid Choice.");
					break;
			}
		}
		

	}

}

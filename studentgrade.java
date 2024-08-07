

   enum grade
     {
	   A,B,C,D
	
     }
public class studentgrade
{
     public void test()
     {
    	 grade g = grade.A;
    	 switch (g)
    	 {
    	 case A:
    	 
    		 System.out.println("Call for Grade A.");
    	 
    	 case B:
    	 
    		 System.out.println("Call For Grade B.");
    	 
    	 case C:
    	 
    		 System.out.println("Call for Grade C.");
    	 
    	 case D:
    	 
    		 System.out.println("Call for Grade D.");
    	default:
    		System.out.println("Thank You!!");
    	 
    	 }
     }
	public static void main(String[] args) 
	{
		studentgrade s1= new studentgrade();
		s1.test();
		
		
		
		
		
	}

}

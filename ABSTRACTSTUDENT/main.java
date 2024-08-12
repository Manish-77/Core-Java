package ABSTRACTSTUDENT;


public class main {

	public static void main(String[] args)
	{
       engineeringstudents e1 = new engineeringstudents();
	   e1.exam(); 
	   e1.project();
	   e1.dresscode();
	   e1.assignments();
	   e1.knowledge(); //CONCRETE METHOD
	   
	   
	   System.out.println("       ");
	   
	   
	   student st = new engineeringstudents();
	   st.exam();
	   st.project();
	   st.knowledge(); //CONCRETE METHOD
		
	}

}

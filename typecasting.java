package practice1;

public class typecasting {
	public static void main(String[] args) 
	{ //Typecasting is nothing but changing the datatype of the variable.
		
		// Converting to String.
		int a = 145;
		String st = "z";
		st = st.valueOf(a);
		System.out.println(st);
		System.out.println(st.getClass());
		System.out.println("===========");
		
		double d = 12.22;
		String st1 = "z";
		st1 = st1.valueOf(d);
		System.out.println("st1 is "+st1.getClass());
		System.out.println("==========================");
		
		//Converting to integers,doubles.
		
		String s1 = "1245";
		Integer a1 = Integer.parseInt(s1);
		System.out.println("a1 is "+a1.getClass());
		
		String s2 = "124.20";
		Double d1 = Double.parseDouble(s2);
		System.out.println("d1 is "+ d1.getClass());
		
		
		

	}

}

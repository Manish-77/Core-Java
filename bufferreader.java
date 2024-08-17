package bufferreader;
import java.io.*;
public class bufferreader 
{

	public static void main(String[] args) throws IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a,b, sum;
		System.out.println("Enter First Number :");
		a = Integer.parseInt(br.readLine());
		System.out.println("Enter Second Number :");
		b = Integer.parseInt(br.readLine());
		sum = a+b;
		System.out.println("Sum ="+sum);
		
		int z= br.read();
		System.out.println(z);
		
	}

}

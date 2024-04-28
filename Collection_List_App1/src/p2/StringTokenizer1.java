package p2;
import java.util.*;
public class StringTokenizer1
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		try(s;)
		{
		
				System.out.println("Enter the String:");
				String str=s.nextLine();
				System.out.println("Enter the delimeter:");
				String dl=s.nextLine();
				StringTokenizer ob = new StringTokenizer(str, dl);
				System.out.println("Count of Tokens: "+ob.countTokens());
				System.out.println("===Display Tokens===");
				while(ob.hasMoreTokens())
				{
					String tk = ob.nextToken();
					System.out.println(tk.toString());										
				}
				System.out.println("===============");
				System.out.println("Count of Tokens: "+ob.countTokens());
				
			
				
			
			
		}//end try with resource

	}
}


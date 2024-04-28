package p2;
import p1.*;
import java.util.Scanner;
public class DemoException5  
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		try(s)
		{
			int x=Integer.parseInt(s.nextLine());
			Display ob1 =new Display("");
		    ob1.dis(x);
		    System.out.println("marks:"+x);

                  System.out.println("Valid marks");
		    		    
		    			
		    		}//try block
		    		catch(NumberFormatException nfe)
		    		{
		    			System.out.println("Enter Integer value");
		    			
		    		}
		    		catch(Display ob1)
		    		{
		    			ob1.printStackTrace();
		    			
		    		}

	}}

		    



package p2;
import java.util.Scanner;
@SuppressWarnings("serial")
public class DemoException2 extends Exception
{
	public DemoException2(String msg)
	{
		super(msg);
	}
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		
		
		try
		{
			
			System.out.println("Enter the Subject Marks:");
			
			int x=Integer.parseInt(s.nextLine());
			 
			
			if(x<=0||x>100)
			{
				
				DemoException2 ob1=new DemoException2("Invalid Marks");
			    throw ob1;	
			}
			if(x>=0 && x<=34)
			{
				System.out.println("Failed In CoreJava");
				
			}
			else
			{
				System.out.println("Valid Marks:");
				System.out.println("Marks in CoreJava:"+x);
			}
			
		       
			
		}
	//end of try
		
		  catch(NumberFormatException nfe)
			{
			System.out.println("Enter Integer Value");
			}
			catch(DemoException2 ob1)
			{
			  System.out.println(ob1);
			}
			

		finally
		{
		s.close();	
		}
		
		
		
	}

}

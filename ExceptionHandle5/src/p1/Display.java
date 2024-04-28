package p1;
import java.util.Scanner;
@SuppressWarnings({ "serial" })
public class Display extends Exception 
{
	
   public Display(String msg)
   {
	   super(msg);
   }
   
	public static void main(String[] args)
	{
		
		Scanner s=new Scanner(System.in);
		try(s) 
		{
		int i=1;	
		while(i<=6)
		{
			System.out.println("Enter the  6 subject marks-"+i);
			int x=Integer.parseInt(s.nextLine());
			if(x<0||x>100)
			{
				
				Display ob=new Display("Invalid marks");
				throw ob;
			}
			if(x>=0 && x<=34)
			{
				System.out.println("Failed");
				
			}
			
			i++;
		}
		}
		catch(NumberFormatException nge)
		{
			System.out.println("Enter the integer value");
		}
			catch(Display ob)
			{
			System.out.println(ob.getMessage());
				
			}
		
	}

}

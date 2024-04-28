//User-defined UnChecked Exception

package p2;
 import java.util.Scanner;
 
@SuppressWarnings("serial")
public class DemoException1 extends Exception//step1:extends with Exception 
{
	public DemoException1(String msg)//step2:create parameterized constructor with class 
	{                                //parameter is taken String
		super(msg);	// step3:This parameterized constructor must pass exception-msg to
		//ParentClass(Exception-class) using &quot;super()&quot;.
		}
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		try      //step4:taken try block and take Statement
		{   
			System.out.println("Enter the value:");
			int a=Integer.parseInt(s.nextLine());
			if(a<20)//Step5:Take The Exception-condition To raise Exception 
			{
				DemoException1 cd=new DemoException1("Invalid A");//Step6:When Exception-condition true,then Create object for constructor
				throw cd;//Step7:UseThrow keyword throw the objectReference to catch block
			}
			System.out.println("The value a:"+a);
		}//end of try
		catch(NumberFormatException nfe)
		{
			System.out.println("Enter the Integer value");
			
		}
		catch(DemoException1 cd)//Step8:catch block take constructorName and ObjectName 
		{
			System.out.println(cd.getMessage());//Step9:print the Message ObjectName.getMessageMehod 
			
		}
		finally
		{
		s.close();	
		}

	}

}

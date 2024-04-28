package p2;
import p1.Password;
import java.util.Scanner;
public class DemoException4 {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		try
		{
			System.out.println("Enter The password:");
			String pass=s.nextLine();
			Password ob1=new Password("");
			ob1.validatePassword(pass);
			System.out.println("ValidatePassword"); 
			System.out.println("Password:"+pass);
		}//end of try
		catch(Password ob1)
		{
			System.out.println(ob1.getMessage());
			
			
		}
		finally
		{
		 s.close();	
		}
		

	}

}

//UserDefined CheckedException
package macces;
import java.util.Scanner;
import test.CheckBranch;//import package_name and Class_name 
public class DemoExceptionHandle3 {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		try
		{
			System.out.println("Enter the branch:");
			String br=s.nextLine();
			CheckBranch ob1=new CheckBranch("");//class_object creation
			ob1.chek(br);//method
			System.out.println("Valid marks");
			System.out.println("Branch:"+br);
			
		}
		catch(CheckBranch ob1)
		{
			System.out.println(ob1.getMessage());
			
		}
		finally {
			s.close();
		}
		

	}

}

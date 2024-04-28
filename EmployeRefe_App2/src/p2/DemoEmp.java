package p2;
import java.util.Scanner;
import p1.*;

public class DemoEmp
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		Employee e=new Employee();
		System.out.println("Enter the id:");
		e.id=s.nextLine();
		System.out.println("Enter the name:");
		e.name=s.nextLine();
		System.out.println("Enter the Role:");
		e.role=s.nextLine();
		System.out.println("Enter the hno:");
		e.ad.hno =s.nextLine();
		System.out.println("Enter the sname:");
		e.ad.sname=s.nextLine();
		System.out.println("Enter the city:");
		e.ad.city=s.nextLine();
		System.out.println("Enter the state:");
		e.ad.state=s.nextLine();
		System.out.println("Enter the pincode:");
		e.ad.pincode=Integer.parseInt(s.nextLine());
		System.out.println("Enter the email:");
		e.ct.mid=s.nextLine();
		System.out.println("Enter the phoneno:");
		e.ct.phno=s.nextLong();
		e.getEmployee();
		e.ad.getAddres();
		e.ct.getContact();
		
		s.close();
		
		
	}
}
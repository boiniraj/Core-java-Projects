package p2;
import p1.*;
import java.util.Scanner;
public class DemoArrithematic1
{
	public static void main(String args[])
	{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the value 1:");
	int v1=s.nextInt();
	System.out.println("Enter the value 2:");
	int v2=s.nextInt();
	System.out.println("**Choice**");
	System.out.println("1.add\n2.sub\n3.mul\n4.Divi\n5.mod");
	System.out.println("Enter the choice:");
	int choice=s.nextInt();
	switch(choice)
	{
	case 1:
		Addition ob=new Addition();
		//
		System.out.println("Addition: "+ob.m1(v1,v2));
		break;
	case 2:
		Subtraction sb=new Subtraction();
		System.out.println("Subtraction: "+sb.m1(v1,v2));
		break;
	case 3:
		Multiplication Ml=new Multiplication();
		System.out.println("Multiplication: "+Ml.m1(v1,v2));
		break;
	case 4:
		Division dv=new Division();
		System.out.println("Division: "+dv.m1(v1,v2));
		break;
	case 5:
		ModDivision md=new ModDivision();
		System.out.println("ModDivision: "+md.m1(v1,v2));
		break;
		default:
			System.out.println("Invalid choice");
			break;
		
	
	}//end switch
	s.close();
	}
	


}

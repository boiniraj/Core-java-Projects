package p2;
import java.util.Scanner;
import p1.*;
public class Demoinheritence5
{
	public static void main(String args[])
	{
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the stuid:");
		int Studentid=Integer.parseInt(s.nextLine());
	   
	       System.out.println("Enter the name:");
	         String name=s.nextLine();
			
			System.out.println("Enter The totalAmount(1500+25000+30000)");
			 int amt=s.nextInt();
			 System.out.println("**choice**");
			 System.out.println("1.DayScholor"+"2.Hosteller");
			 System.out.println("Enter the choice");
			 int choice=s.nextInt();
			 switch(choice)
			 {
			 case 1:
				 DayScholar ob1=new DayScholar();
				 ob1.Studentid=Studentid;
				 ob1.name=name;
				 System.out.println (ob1.displayDetails());
				 System.out.println("RemainingAmt:"+ob1.payFee(amt));
				 break;
			 case 2:
				 Hosteller ob2=new Hosteller();
				 ob2.Studentid=Studentid;
				 ob2.name=name;
				 System.out.println(ob2.displayDetails());
				 System.out.println("RemaininAmt:"+ob2.payFee(amt));
				 break;
				 default:
					 System.out.println("Invalid choice");
			 
			 }//end switch
			 s.close();
	
	

	}
}

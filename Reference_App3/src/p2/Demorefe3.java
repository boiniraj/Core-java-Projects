//The Concept in which the reffered Object-reference is available to
//more than one Object at-a-time,is known as Loosly Coupled Reference.
//object interlinking 
//
package p2;
import java.util.Scanner;
import p1.*;
public class Demorefe3
{
public static void main(String[] args)
{
	Scanner s=new Scanner(System.in);
	Account ad=new Account();//object reference
	CreateAccount ca=new CreateAccount(ad);//object1
	DisplayAccount da =new DisplayAccount(ad);//object2
	System.out.println("Account number:");
	long accNo= Long.parseLong(s.nextLine());
	System.out.println("Account HolderName:");
	String cName=s.nextLine();
	System.out.println("Account Type:");
	String accType=s.nextLine();
	System.out.println("Account Balence:");
	float bal=s.nextFloat();
	ca.create(accNo,cName,accType,bal);
	da.dis();
	s.close();
}
}

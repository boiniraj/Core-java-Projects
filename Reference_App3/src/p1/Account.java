//The Concept in which the reffered Object-reference is available to
//more than one Object at-a-time,is known as Loosly Coupled Reference.
//object interlinking 

package p1;
public class Account
{
	public long accNo;
	public String cName,accType;
	public float bal;
	
public void getaccount()
{
    System.out.println("**Account Details**");
	System.out.println("Account Number:"+accNo);
	System.out.println("Account HolderName:"+cName);
	System.out.println("Account Type:"+accType);
	System.out.println("Account Balence:"+bal);
}
}
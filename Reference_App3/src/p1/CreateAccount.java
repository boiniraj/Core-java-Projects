package p1;

public class CreateAccount 
{
	public Account ac;//instance variable
	public CreateAccount(Account ac)//same class name use constroctor
	{
		this.ac=ac;//instance variable and local variable same use "this"key word
		
	}
	public void create(long accNo,String cName,String accType,float bal)
	{
		ac.accNo=accNo;
		ac.cName=cName;
		ac.accType=accType;
		ac.bal=bal;
	}
}

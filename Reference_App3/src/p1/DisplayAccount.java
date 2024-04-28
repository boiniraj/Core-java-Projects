package p1;

public class DisplayAccount
{
	public Account ac;//class return type
	public DisplayAccount(Account ac)//constroctor use same name of class
	{
		this.ac=ac;
	}
	public void dis()
	{
		ac.getaccount();
	}
}

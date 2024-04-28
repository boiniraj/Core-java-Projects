
package p1;
import java.util.*;
public final class Tclass//final class
{
	private final long hAccNo,bAccNo;//private and final variable
	private final float amt;
	private final Date dTime;
	public Tclass(long hAccNo,long bAccNo,float amt,Date dTime)//constructor access the class return type
	{
		this.hAccNo=hAccNo;//intialize the instance variables and local variables
		this.bAccNo=bAccNo;
		this.amt=amt;
		this.dTime=dTime;
	}
	public final long getHAccNo()//final and getter methods
	{
		return hAccNo;//method return type
	}
	public final long getBAccNo()
	{
		return bAccNo;
	}
	public final float getAmt() 
	{
		return amt;
	}
	public final Date getDate()
	{
		return dTime;
	}

}

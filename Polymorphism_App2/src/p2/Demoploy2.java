package p2;
import p1.*;
import java.util.*;
public class Demoploy2
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		try(s;)
		{
			try {
				
		System.out.println("Haccno:");
		long hAccNo=s.nextLong();
		System.out.println("BaccNo:");
		long bAccNo=s.nextLong();
		System.out.println("AmtTransfer:");
		float amt=s.nextFloat();
		//immutable object
		Tclass ob=new Tclass(hAccNo,bAccNo,amt,new Date());//once object created cannot modified
		System.out.println("**LogDetails**");
		System.out.println("HAccno:"+ob.getHAccNo());
		System.out.println("BAccno:"+ob.getBAccNo());
		System.out.println("Amt:"+ob.getAmt());
		System.out.println("DateTime:"+ob.getDate());
			}//end of try
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}//end of try
		
		
		
		
		

	}

}

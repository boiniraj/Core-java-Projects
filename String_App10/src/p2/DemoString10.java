package p2;
import p1.*;
import java.util.Scanner;
public class DemoString10 extends Exception
{
	private static final long serialVersionUID = 1L;
	public DemoString10(String msg)
	{
		super(msg);
	}
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		try(s;){
			try {
			System.out.println("Enter the rollNo:");
			String rNo=s.nextLine();
			if(rNo.length()!=10)//Exception Condition
			{
				DemoString10 ob=new DemoString10("Invalid rollNO");
				throw ob;
			}
			System.out.println("Enter the Branch(CSE/ECE/EEE): ");
			String br=s.nextLine().toUpperCase();
			boolean z=new CheckBracnch().verify(br);
			if(!z)//exception condition
			{
				DemoString10 ob=new DemoString10("Invalid Branch");
				throw ob;
			}
			String brCode=rNo.substring(6,8);
			String gBr=new GenerateBranch().generate(brCode);
			if(gBr==null)//Exception condition
			{
				DemoString10 ob=new DemoString10("RollNo holding invalid brCode..");
				throw ob;
			}
			if(!gBr.equals(br))//Exception condition
			{
				DemoString10 ob=new DemoString10("RollNo Not belong to Branch..");
				throw ob;
			}
			System.out.println("Stu-RollNo:"+rNo);
			System.out.println("Stu-Branch:"+br);
		}//end of try 
		catch(DemoString10 ob)
		{
			System.out.println(ob.getMessage());
		}
		}//end of try with resource
	}

}

package p2;
import p1.ITest;
import java.util.Scanner;
public class DemoLambda2 
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("The value:");
		int v1=s.nextInt();
		System.out.println("The Value:");
		int v2=s.nextInt();
		System.out.println("** choice**");
		System.out.println("\t1.Greter Value"+"\n\t2.Smaller Value");
		System.out.println("Enter the choice:");
		int choice=s.nextInt();
		switch(choice)
		{
		case 1:
			ITest ob = (int p,int q) ->
			{
				if(p>q) return p;
				else return q;
			};
			int result=ob.Icomparable(v1,v2);
			System.out.println("Greater Value:"+result);
			
		break;
		case 2:
			ITest ob1=(int p,int q)->
			{
				if(p<q)return p;
				else return q; 
			};
			int result1=ob1.Icomparable(v1,v2);
			System.out.println("Smaller Value:"+result1);
		
			break;
			default:
				System.out.println("**Invalid Choice**");
		
		

	}//end the choice
		s.close();

}
}

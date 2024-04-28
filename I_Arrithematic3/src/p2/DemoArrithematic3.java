package p2;
import p1.Icomparable;
import java.util.Scanner;
public class DemoArrithematic3
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value1:");
		int v1=s.nextInt();
		System.out.println("Enter the value2:");
		int v2=s.nextInt();
		while(true)
		{
		System.out.println("**Choice**");
		System.out.println("1.add\n2.sub\n3.mul\n4.div\n5.ModDivi\n6.exit");
		System.out.println("Enter the choice:");
		int choice=s.nextInt();
		
		switch(choice)
		{
		case 1:
		Icomparable ob=(int a,int b)->
		{
			return a+b;
			
		};
		System.out.println("Addition:"+ob.m1(v1,v2));
		break;
		case 2:
			Icomparable sb=(int a,int b)->
			{
				return a-b;
			};
			System.out.println("Subtraction:"+sb.m1(v1,v2));
			break;
		case 3:
			Icomparable ML=(int a,int b)->
			{
				return a*b;
			};
			System.out.println("Multipliction:"+ML.m1(v1,v2));
			break;
		case 4:
			Icomparable Dv=(int a,int b)->
			{
				return a/b;
			};
			System.out.println("Division:"+Dv.m1(v1,v2));
			break;
		case 5:
			Icomparable md=(int a,int b)->
			{
				return a%b;
			};
			System.out.println("ModDivision:"+md.m1(v1,v2));
			break;
		case 6:
			System.out.println("Program Stopped");
			System.exit(0);
			default:
				System.out.println("Invalid Choice");
			
		}//end switch

}//end while
}
}


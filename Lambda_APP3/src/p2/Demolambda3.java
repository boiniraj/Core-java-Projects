package p2;
import p1.ITest;
public class Demolambda3
{
	 public static int b=20;
	public static void main(String[] args)
	{  
		
		int c=30;
		ITest ob=(int z)->
		{
			System.out.println("**LambdaExpression**");
			System.out.println("The value a:"+ITest.a);
			System.out.println("The Value b:"+b);
			System.out.println("The Value c:"+c);
			System.out.println("The Value z:"+z);
			
			
		};
		ob.m1(40);
	}
	

}

package p2;
import p1.ITest;
public class DemoLambda1 {
	public static void main(String[] args)
	{
		ITest ob=(int x)->//The abstract method of interface is attached with the LambdaExpression
		                   //and we call LambdaExpression for execution using abstract_method_name.
				{
					//without method name declared Lambda expression
					System.out.println("**Lambda expression**");
					System.out.println("The Value x:"+x);
			
				};
				ob.m1(22);//for execution using abstract_method_name.
				ob.m2(33);
		
	

	}

}

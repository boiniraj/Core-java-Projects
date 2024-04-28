/*
 Can we compare Strings using is equal (==) operator?
=>is equal (==) operator will compare the references of Objects,
because of this reason is equal(==) operator is not preferable
to use on NonPrimitive data type variables.

Note:
=>is eqaul (==) operator must be used only on Primitive data types
variables.*/


package p1;
public class DemoString7 {

	public static void main(String[] args)
	{
		String s1=new String("java");
		String s2=new String("java");
		System.out.println("***new operater procces***");
		if(s1==s2)
		{
			
			System.out.println("Strings are Equals...");
		}
		else
		{
			System.out.println("Strings are NotEquals...");
		}
		String s3="java";
		String s4="java";
		System.out.println("***Literal procces***");
		if(s3==s4)
		{
			
			System.out.println("String are Equals...");
		}
		else
		{
			System.out.println("Strings are NotEquals...");
		}
		
	}

}

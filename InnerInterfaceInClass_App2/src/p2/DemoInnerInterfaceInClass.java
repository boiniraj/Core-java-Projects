package p2;
import p1.Aclass;
import p1.ITest3;
import p1.Subclass;
public class DemoInnerInterfaceInClass
{
	public static void main(String[] args)
	{
		Subclass.ITest1 ob1=(int j)->
		{
			System.out.println("**InnerInterface instance m1() In Clases**");
			System.out.println("The value j:"+j);
		};
		ob1.m1(10);
		Subclass.ITest2 ob2=(int k)->
		{
			System.out.println("**InnerInterface static m2() In Clases**");
			System.out.println("The Value k:"+k);
			
		};
		ob2.m2(20);
		ITest3.ITest4 ob3=(int m)->
		{
			System.out.println("**InnerInterface static m2() In interface**");
			System.out.println("The value m:"+m);
			
		};
		ob3.m3(30);
		ITest3.ITest5 ob4=(int n)->
		{
			System.out.println("**InnerInterface instance m2() In interface**");
			System.out.println("The value n:"+n);
			
		};
		ob4.m4(40);
		Aclass.ITest6 ob6=(int p)->
		{
			System.out.println("**InnerInterface instance m2() In AbstractClass**");
			System.out.println("The value p:"+p);
		};
		ob6.m6(50);
		Aclass.ITest7 ob8=(int q)->
		{
			System.out.println("**InnerInterface Static m2() In AbstractClass**");
			System.out.println("The Value q:"+q);
			
		};
		ob8.m7(60);
		
	}

}

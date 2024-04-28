//Non-StaticMember LocalInnerClass

package p1;
public class Subclass1
{
	public int a=10;
	public static int b=20;
	public void m1()
	{
		System.out.println("**Outer-Class**");
		System.out.println(" Value a:"+a);
		System.out.println(" Value b:"+b);
		 class Subclass2
		{
			   public int c=30;
			   public static int d=40;
			  public void m2()
			  {
				  System.out.println("**Local InnerClass Instance m2()**");
				  System.out.println("a:"+a);
				  System.out.println("b:"+b);
				  System.out.println("c:"+c);
				  System.out.println("d:"+d);
				  
			  }
		}
		 Subclass2 ob=new Subclass2();
		 ob.m2();
	}//OuterClass instance Method
	
   public static void m22()
   {
	   class Subclass3
	   {
		   public int e=50;
		   public static int f=60;
		   public void m3()
		   {
			   System.out.println("**LocalInner-class Static method**");
			   System.out.println("e:"+e);
			   System.out.println("f:"+f);
			   System.out.println("b:"+b);
			   
		   }
	   }
	   Subclass3 ob1=new Subclass3();
	   ob1.m3();
   

}
}

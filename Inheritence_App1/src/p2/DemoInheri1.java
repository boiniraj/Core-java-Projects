//In Inheritance process we always create object for ChildClass,because
//members of ParentClass are available to ChildClass

package p2;
import java.util.Scanner;
import p1.*;
public class DemoInheri1
{
	public static void main(String[] args)
	{
	Scanner s=new Scanner(System.in);
	  C2 ob=new C2();//object create child class only inheritance
	  ob.a = s.nextInt();
	  System.out.println("Enter the value for b:");
	  C2.b = s.nextInt();
	  System.out.println("Enter the value for x:");
	  ob.x = s.nextInt();
	  System.out.println("Enter the value for y:");
	  C2.y = s.nextInt();
	  ob.m1();
	  C2.m11();
	  ob.m2();
	  C2.m22();
	  
	  s.close();
}
}

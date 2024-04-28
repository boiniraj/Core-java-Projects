package p2;
import p1.Subclass;
import java.util.Scanner;
public class DemoInnerConstroctor 
{
  public static void main(String[] args)
	{
	  Scanner s=new Scanner(System.in);
	  System.out.println("Value a:");
	  int a=s.nextInt();
	  System.out.println("Value b:");
	  int b=s.nextInt();
	  System.out.println("Value c:");
	  int c=s.nextInt();
	  System.out.println("Value d:");
	  int d=s.nextInt();
	  Subclass ob=new Subclass( a,b);
	  ob.m1();
	  Subclass.Subclass2 ob1=ob.new Subclass2(c,d);//OuterClass.InnerClass InnerClass_ObjectName=
	  ob1.m2();                                    //OuterClass_ObjectName.new InnerClass
	  Subclass.Subclass2.m3();
	  s.close();
		
		

	}

}

package p2;
import p1.*;
import java.util.Scanner;
public class DemoinnerConstractor
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("a:");
		int a=s.nextInt();
		System.out.println("b:");
		int b=s.nextInt();
		System.out.println("c:");
		int c=s.nextInt();
		System.out.println("d:");
		int d=s.nextInt();
		Subclass1 ob=new Subclass1(a,b);
		ob.m1();
		Subclass1.Subclass2 ob1= new Subclass1.Subclass2(c, d);
		ob1.m2();
		Subclass1.Subclass2.m3();
		s.close();
		

	}

}

package p2;
import p1.Pclass;
import java.util.Scanner;
public class DemoAnonymous1 {
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Value a:");
		    int r1=s.nextInt();
		System.out.println("Value b:");
		   int v1=s.nextInt();
		
		Pclass ob=new Pclass()
				{
			     public void m1()
			     {
			    	 System.out.println("----OverRiding method m1()----");
			    	System.out.println("a:"+r1);
			 		System.out.println("b:"+v1);
			     }
			
				};
				ob.m1();
				Pclass.b=v1;
				Pclass.m2();
				s.close();
				
		

	}

}

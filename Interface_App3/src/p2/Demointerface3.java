package p2;
import p1.*;
import java.util.Scanner;
public class Demointerface3
{
 public static void main(String args[])
 {
	Scanner s=new Scanner(System.in);
	System.out.println("x:");//read values
	 int x=s.nextInt();
	 System.out.println("y:");
	 int y=s.nextInt();
	
	 while(true)
	 {
		 System.out.println("**choice**");
		 System.out.println("1.add/n2.sub/n3.mul/n4.div/n5.mod");
		 int choice=s.nextInt();//choice
		 switch(choice)
		 {
		 case 1:
			 Addition ad =new Addition();//object
			 double r1=ad.cal(x,y);//return type
			 System.out.println("sum:"+r1);
			 break;
		 case 2:
			 Sub sb=new Sub();
			 double r2= sb.cal(x, y);
			 System.out.println("sub:"+r2);
			 break;
		 case 3:
			 Mul ml=new Mul();
			 double r3=ml.cal(x,y);
			 System.out.println("mul:"+r3);
			 break;
		 case 4:
			 Div dv=new Div();
			 double r4=dv.cal(x, y);
			 System.out.println("mul:"+r4);
			 break;
		 case 5:
			 Mod mo=new Mod();
			 double r5=mo.cal(x, y);
			 System.out.println("Mod:"+r5);
			
			 
		 }
	 }//loop closed
	 
 }
	 
	 
	 

}

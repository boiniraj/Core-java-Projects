package p3;

import java.util.Scanner;

import p1.Greter;
import p2.Smaller;

public class comparisons {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value1=");
		int v1=s.nextInt();
		System.out.println("Enter the value 2=");
		int v2=s.nextInt();
		while(true)
		{
			System.out.println("**choice**");
			System.out.println("1.greter/2.smal/3.exit");
			System.out.println("Enter the choise");
			 int choice=s.nextInt();
			 switch(choice)
			 {
			 case 1:
				 Greter ge=new Greter();
				 int r1=ge.great(v1,v2);
				 System.out.println("great"+r1);
				 break;
			 case 2:
				 Smaller se=new Smaller();
				 int r2=se.small(v1, v2);
				 System.out.println("Smaller:"+r2);
				 break;
			 case 3:
				 System.out.println("Program stopped");
				 System.exit(0);
        s.close();
	}

}
	}
}

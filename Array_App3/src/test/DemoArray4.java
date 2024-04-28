/*2.Multi Dimensional Arrays:
=>The Arrays which are declare with multiple dimensions are known as Multi-D
Arrays.
=>The following is the syntax to represent 2-D Arrays:
Class_name arr_var[][] = new Class_name[rows][cols];
=>wap to read and displat 3X3 Matrix?



*/




package test;
import java.util.*;
public class DemoArray4
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		try (s;){
			try {
				Integer A[][]=new Integer[3][3];
				System.out.println("==Enter the 3x3 matrics:==");
				for(int i=0;i<=2;i++)
				{
					for(int j=0;j<=2;j++)
					{
					   A[i][j]=new Integer(s.nextInt());	
					}//end of inner loop
						
					
				}//end of outer loop
				System.out.println("==Dispaly 3x3 matrix==");
				for(int i=0;i<=2;i++)
				{
					for(int j=0;j<=2;j++)
					{
						System.out.print(A[i][j]+" ");
					}//inner loop
					System.out.println();
				}//outer loop
			
				
				
			       
			}catch(Exception e)
			{
				e.printStackTrace();}
			
		}//end of try

	}
}




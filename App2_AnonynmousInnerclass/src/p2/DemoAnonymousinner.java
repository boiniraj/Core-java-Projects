package p2;
import p1.ITest;
import java.util.Scanner;
public class DemoAnonymousinner
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("The value a:");
		int v1=s.nextInt();//These two lines prompt the user to enter the value of a and read the input as an integer, storing it in the variable v1.
		System.out.println("The value b:");
		int v2=s.nextInt();
		System.out.println("Enter the choice");
		System.out.println("\t1.Greter Value"+"\n\t2.Smaller Value");
		System.out.println("Enter The Choice");
		int choice=s.nextInt();//smaller value of a and b. The user's choice is stored in the variable choice.
		switch(choice)//A switch statement is used to perform different actions based on the value of choice.
		{
		case 1:
			ITest ob=new ITest()//In case the user chose 1, an anonymous inner class is created that implements the ITest interface and overrides the Icomparable method to return the greater value of a and b
			{
				public int Icomparable (int a,int b)
				{
					if(a>b) return a;
					else return b;
					
				}
				
			};
			//Anonymous GreterValue 
			int result=ob.Icomparable(v1,v2);//The Icomparable method of the anonymous inner class is called with the values entered by the user, and the result is printed.
			System.out.println("Greater Value:"+result);
			break;
		case 2:
			//Anonymous SmallerValue
			ITest ob1=new ITest()
			{
			  public int Icomparable(int a,int b)
			  {
				  if(a<b)return a;
				  else return b;
			  }
			};
			int result1=ob1.Icomparable(v1,v2);
			System.out.println("Smaller value:"+result1);
			break;
			default:
				System.out.println("--Invalid choice--");
				break;	
		}//end of switch
		s.close();
		
		
	}

}

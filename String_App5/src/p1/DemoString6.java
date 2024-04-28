/*(ii)compareTo():
=>compareTo() method is also used to compare the Strings and generate
int-result
int k = s1.compareTo(s2);

if s1==s2 , then k=0

if s1&gt;s2 , then k&gt;0
if s1&lt;s2 , then k&lt;0


*/
package p1;
import java.util.Scanner;
public class DemoString6
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		try(s;)
		{
			System.out.println("Enter the String-1:");
			String s1=s.nextLine().trim();
			System.out.println("Enter the String-2:");
			String s2=s.nextLine().trim();
			System.out.println("***compareTo***");
			int k=s1.compareTo(s2);			
			if( k==0)
			{
			  System.out.println("String is Equals...");				
			}
			else if(k>0)
			{
				System.out.println(s1+" GreterThan "+s2);
			}
			else 
			{
				System.out.println(s1+" LessThan "+s2);
				
			}
			System.out.println("***compareToIgnoreCase***");
			int z=s1.compareToIgnoreCase(s2);
			if(z==0)
			{
				System.out.println("Strings are Equals...");				
			}
			else if(z>0)
			{
				System.out.println(s1+"  Greter Than "+s2);
			}
			else 
			{
				System.out.println(s1+"  Less than  "+s2);
				
			}
		}//end of try with resource
	}
}
/*=>In realtime,compareTo() method is used in Sorting process.*/

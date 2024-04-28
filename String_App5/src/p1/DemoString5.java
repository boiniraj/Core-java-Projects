/*define String Comparision process?
=>The process of comparing two Strings is known as String Comparision
process.
=>we use the following methods to perform String-Comparision process:
(i)equals()
=>equals() method will compare two strings and generate boolean result.
(ii)compareTo()
*/
package p1;
import java.util.Scanner;
public class DemoString5
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		try(s;){
		System.out.println("Enter The String-1:");
		String s1=s.nextLine().trim();
		System.out.println("Enter The String-2:");
		String s2=s.nextLine().trim();
		boolean p=s1.equals(s2);
		if(p) 
		{
			System.out.println("Strings are equals.....");
		}
		else {
			System.out.println("Strings are NotEquals....");
			
		}
		boolean q=s1.equalsIgnoreCase(s2);
		if(q)
		{
			System.out.println("Strings are equals...");
		}
		else
		{
			System.out.println("Strings are NotEquals...");
		}
		
		
		
		}//end of try
		

	}

}
/* =>;In realtime equals() method us used for User Authentication process,
which means user identifications.*/
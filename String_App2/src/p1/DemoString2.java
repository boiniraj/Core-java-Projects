/*wap to read a String and display the reverse of String?*/
package p1;
import java.util.Scanner;
public class DemoString2
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		try(s;)
		{
			System.out.println("Enter the String:");
			String str=s.nextLine();//Reads a line of text from the user and stores it in the str variable.
			int len=str.length();
			for(int i=len-1;i>=0;i--)/*(len - 1 is the index of the last character in a zero-based index system).
			i >= 0;: The loop will continue as long as the value of i is greater than or equal to 0.
			 This ensures that the loop iterates through all the characters in the string from the last character to the first.
			 i--: Decrement the value of i in each iteration. This is the update statement that moves the loop toward the beginning of the string.*/
			{
				char ch=str.charAt(i);// Extracts each character at the current position in the loop.
				System.out.println(ch+"");
			}
		}//end of try with resource
		

	}

}

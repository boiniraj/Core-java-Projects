/*wap to read a string and check the Strimg is Palindrome String or not?*/

package p1;
import java.util.Scanner;
public class DemoString9
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		try(s;)
		{
			System.out.println("Enter The string: ");
			String str=s.nextLine();
			int len= str.length();
			int k=len-1;// Initialize 'k' to the last index of the string
			int count=0;//Initialize 'count' to 0This line declares and initializes another integer variable named count.
			//count is used to keep track of the number of matching characters during the comparison of characters in the string.
			for(int i=0;i<=len - 1;i++)//// Loop through the string to check for palindrome
			{
				if(str.charAt(i)==str.charAt(k))//The loop compares characters at positions i and k. If they match, count is incremented.
				{
					count++;//The loop compares characters at positions i and k. If they match, count is incremented.
				}
				else
				{
					break;//stop the loop
				}
				k--;//During the loop, it's decremented in each iteration (k--) to traverse the string backward.
			}//end of loop
			if(count==len) 
			{
				System.out.println("palindrome String...");
				
			}
			else
			{
				System.out.println("NotPalindrome String...");
				
			}
			
		}//end of try
		

	}

}

/*
 wap to read a String and display the following:
Count of Vowels :
Count of Consonents :
Count of Numbers :
*/

package p1;
import java.util.Scanner;
public class Demostring8
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		try(s;)
		{
			System.out.println("Enter The String Value:");
			String s1=s.nextLine();
			int len=s1.length();
			int ac=0,vc=0,nc=0;	//Three variables ac, vc, and nc are initialized to 0 to count the number of alphabets, vowels, consonants, and numbers.		
			for(int i=0;i<=len-1;i++)
			{
				char ch =s1.charAt(i);
				int av=(int)ch;//char into ASCII
				if((av>=65&&av<=90)||( av>=97&&av<=122));
				{
					ac++;
					switch(ch)
					{
					case 'a':
					case 'A':vc++;
					   break;
					case 'e':
					case 'E':vc++;
						break;
					case 'i':
					case 'I':vc++;
						break;
					case 'o':
					case 'O':vc++;
						break;
					case 'u':
					case 'U':vc++;
						break;
						
					}//end of switch
					if(av>=48 && av<=57)
					{
						nc++;
					}
					
				}//end of if
				
			}//end of loop
			System.out.println("Count of Alphabets: "+ac);
			System.out.println("Count of Ovwels: "+vc);
			System.out.println("Count of Consonents: "+(ac-vc));
			System.out.println("Count of numbers: "+nc);
		}//end of try with resource
		

	}

}

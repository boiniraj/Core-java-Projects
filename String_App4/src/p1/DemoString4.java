/* define String Concatenation process?
=>The process of combining multiple Strings into a Single String is
known as String Concatenation process.
=>we use the following two ways to combine the Strings:
(i)Using "+" symbol
(ii)Using 'concat()' method */

package p1;
public class DemoString4
{
	public static void main(String[] args) 
	{
		String s1="java";
		String s2="Programming";
		String s3="Language";
		String s4=s1+" "+s2;
		System.out.println("String is:  "+s4.toString());
		String s5=s1+" "+s3;
		System.out.println("The string is: "+s5.toString());
		String s6=s1+" "+s2+" "+s3;
		System.out.println("The String is:"+s6.toString());
		String s7=s1.concat(" "+s3);
		System.out.println("The String concat():"+s7.toString());
		String s8=s1.concat(" "+s2+" "+s3);
		System.out.println("The string concat():"+s8.toString());
	}

}
/* =>In String Concatenation process,a new String-object is created to
hold concatenated Strings.*/

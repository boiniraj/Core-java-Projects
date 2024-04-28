/*
 define substring()?
=>substring() method is used to retrieve part of string based on
index values.*/

package p1;
public class DemoString7
{
	public static void main(String[] args)
	{
		String s1="language";
		String str=s1.substring(3);
		System.out.println("String value:"+str);
		String strr=s1.substring(2 ,7);
		System.out.println("Sring value:"+strr);

	}

}

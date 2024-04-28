/*Case-3 : Create Object using &#39;StringBuffer(String)&#39; constructor
syntax:
StringBuffer sb = new StringBuffer(&quot;NIT-HYD&quot;);
=>In this syntax the StringBuffer object is created with the default
capacity equal to the &quot;sum of 16 + length of String passed as parameter
while Object creation&quot;*/


package p1;
public class DemoString13
{
	public static void main(String[] args)
	{
		StringBuffer sb=new StringBuffer("NIT-HYD");
		System.out.println("Data in String:"+sb.toString());
		System.out.println("Capacity of String:"+sb.capacity());
		System.out.println("length of String:"+sb.length());
		sb.append(" java programming language");
		System.out.println("Data in String:"+sb.toString());
		System.out.println("Capacity of String:"+sb.capacity());
		System.out.println("length of String:"+sb.length());

	}

}

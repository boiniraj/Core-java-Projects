/*Case-4 : Create Object using &#39;StringBuffer(CharSequence)&#39; constructor
syntax:
StringBuffer sb1 = new StringBuffer(&quot;NIT-HYD&quot;);
StringBuffer sb2 = new StringBuffer(sb1);
=>In this syntax sb2 is created with the default capacity equal to the
&sum of 16 + length of String available in sb1&#39;
=>sb2 is holding the reference of sb1,in this process all the data of
sb1 are available to sb2*/


package p1;
public class DemoString14
{
	public static void main(String[] args)
	{
		StringBuffer sb1=new StringBuffer("NIT-HYD");
		StringBuffer sb2=new StringBuffer(sb1);
		System.out.println("Data in String:"+sb2.toString());
		System.out.println("Capacity of String:"+sb2.capacity());
		sb2.append(" Java programming language");
		System.out.println("Data in String:"+sb2.toString());
		System.out.println("Capacity of String:"+sb2.capacity());
		System.out.println("Length of String:"+sb2.length());

	}

}

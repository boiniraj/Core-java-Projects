/*
 Case-1 : Create Object using &#39;StringBuffer()&#39; constructor
syntax:
StringBuffer sb = new StringBuffer();
=>In this syntax the StringBuffer object is created with the default
capacity 16-characters.
=>we use append()-method to add data to StringBuffer Objects.
=>The capacity of StringBuffer object increases dynamically at runtime
by doubling the capacity and adding 2.

16==>(16+16+2)==&gt;34==&gt;(34+34+2)==&gt;70...
  */

package p1;
public class DemoString11
{
	public static void main(String[] args)
	{
		StringBuffer sb=new StringBuffer();
		System.out.println("String default capacity:"+sb.capacity());
		System.out.println("Length of String:"+sb.length());
		sb.append("rajkumar");
		System.out.println("Data in String:"+sb.toString());
		System.out.println("String capacity:"+sb.capacity());
		System.out.println("Length of string:"+sb.length());
		sb.append(" programming language");
		System.out.println("Data in String:"+sb.toString());
		System.out.println("Capacity of String:"+sb.capacity());
		System.out.println("Length of String:"+sb.length());
		sb.append(" rajkumar");
		System.out.println("Capacity of String:"+sb.capacity());
		System.out.println("Length of String:"+sb.length());
		sb.insert(0,"developer ");
		System.out.println("Data In String:"+sb.toString());
		System.out.println("Capcity of String:"+sb.capacity());
		System.out.println("Length of String:"+sb.length());
		sb.delete(0, 18 );
		System.out.println("Data in String:"+sb.toString());
		System.out.println("Capacity of String:"+sb.capacity());
		System.out.println("length of String:"+sb.length());
		sb.deleteCharAt(10);
		System.out.println("Data in String:"+sb.toString());
		System.out.println("Capacity of String:"+sb.capacity());
		System.out.println("length of String:"+sb.length());
		System.out.println("***reverse of String***");
		sb.reverse();
		System.out.println("Reverese of String:"+sb.toString());
		
		

	}

}

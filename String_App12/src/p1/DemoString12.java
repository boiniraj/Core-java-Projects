/*
 Case-2 : Create Object using &#39;StringBuffer(int)&#39; constructor
syntax:
StringBuffer sb = new StringBuffer(5);
=>In this syntax the StringBuffer object is created with the capacity
equal to the value passed as parameter while Object creation.*/


package p1;
public class DemoString12
{
	public static void main(String[] args)
	{
		StringBuffer sb=new StringBuffer(5);
		System.out.println("Capacity of String:"+sb.capacity());
		System.out.println("Length of String:"+sb.length());
		sb.append("raj");
		System.out.println("Data in String:"+sb.toString());
		System.out.println("Capacity of String:"+sb.capacity());
		System.out.println("Length of String:"+sb.length());
		sb.append("kumar");
		System.out.println("Data in String:"+sb.toString());
		System.out.println("Capacity of String:"+sb.capacity());
		System.out.println("length of String:"+sb.length());
	}

}

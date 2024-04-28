package p1;

public class DemoString1
{
	public static void main(String[] args)
	{
		String s1="program";//String Literal process 
		/*literal process only one object created in String pool area*/
		int len1=s1.length();
		char ch1= s1.charAt(2);
		System.out.println("**s1***");
		System.out.println("data in s1:"+s1.toString());
		System.out.println("The index value:"+len1);
		System.out.println("The index value 2:"+ch1);
		
		String s2=new String("javalanguage");//new operator process
		/*new operator process object created String pool area and HeapArea
		  and heapArea object is hold on string pool object */
		int len2=s2.length();
		char ch2=s2.charAt(5);
		System.out.println("***s2***");
		System.out.println("Data in s2:"+s2.toString());
		System.out.println("The len:"+len2);
		System.out.println("The index valiue 5:"+ch2);
		
		

	}

}

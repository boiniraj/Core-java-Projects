package p1;
import java.util.*;
public class Demoset2
{
	@SuppressWarnings("removal")
	public static void main(String[] args)
	{
		
		Scanner s=new Scanner(System.in);
		
		try(s;)
		{
			try {
				LinkedHashSet<Integer> ob=new LinkedHashSet<Integer>();
		System.out.println("Enter the String...");
		String st=s.nextLine();
		int len=st.length();
		for(int i=0;i<=len-1;i++)
		{
			int k=(int)st.charAt(i);
			ob.add(new Integer(k));
		}//end loop
		Iterator<Integer> it=ob.iterator();
		while(it.hasNext())
		{
			Integer i=(Integer)it.next();
			char ch=(char)i.intValue();
			System.out.print(ch);
		}
			}
			catch(Exception e) {e.printStackTrace();}
		}//end try with resource
	}

}

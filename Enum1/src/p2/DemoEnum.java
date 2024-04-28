package p2;
import p1.Books;
public class DemoEnum {

	public static void main(String[] args) 
	{
		Books ob[]=  Books.values();
	System.out.println("===Display Enum===");
	for(Books k : ob )
	{
		System.out.println("Cost of:"+k.toString()+" is "+k.getPrice());
		
	}
	

	}
}

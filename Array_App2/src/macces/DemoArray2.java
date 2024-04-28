package macces;
import test.BookDetails;
import java.util.*;
public class DemoArray2
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		try(s;){
			try {
				System.out.println("====Enter the no of book ====");
				int n=Integer.parseInt(s.nextLine());
				BookDetails bd[]=new BookDetails[n];
				System.out.println("**Enter "+n+" Book Deatil");
				for(int i=0;i<bd.length;i++)
				{
					System.out.println("==Enter the:" +(i+1)+ ":BookDetails:==");
					System.out.println("Enter the BookCode:");
					String bc=s.nextLine();
					System.out.println("Enter the Book Name:");
					String bn=s.nextLine();
					System.out.println("Enter the BookAuthor:");
					String ba=s.nextLine();
					System.out.println("Enter the BookPrice:");
					float bp=Float.parseFloat(s.nextLine());
					System.out.println("Enter the BookQuality:");
					int bq=Integer.parseInt(s.nextLine());	
					bd[i]=new BookDetails(bc,bn,ba,bp,bq);
				}//end of loop
				System.out.println("**BookDetails**");
				Spliterator<BookDetails> sp=Arrays.spliterator(bd);
				/*=>we use spliterator() method from java.util.Arrays class to create
                 implementation object for Spliterator<T> interface.
                  =>This object will hold the reference of Array-Object.*/
				sp.forEachRemaining((k)->
				{
					System.out.println(k.toString());
					
				});
				System.out.println("==BookDetails Sorted by code==");
				Arrays.sort(bd);
				Spliterator<BookDetails> sp2=Arrays.spliterator(bd);
				sp2.forEachRemaining((k)->
				{
					System.out.println(k.toString());
				}
						);
				
			}
			catch(Exception e)
			{
				e.printStackTrace();
				
			}
			
			
			
			
			
			
			
			
			
		}
		
	

	

}
}

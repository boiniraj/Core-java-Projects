package p2;
import java.util.*;
public class Stack1
{
	@SuppressWarnings("removal")
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		try(s;)
		{
			try {
				Stack<Integer> st=new Stack<Integer>();
				while(true) {
				
				System.out.println("==choice==");
				System.out.println("\t1.push(E)"+"\n\t2.pop()"+"\n\t3.peek()"+"\n\t4.search()"+"\n\t5.Exit()");	
				 
				System.out.println("Enter the choice:");
				 switch(s.nextInt()) 
				 {
				 case 1:
					System.out.println("Enter the element:");
					 st.push(new Integer(s.nextInt()));
					 System.out.println(st.toString());
					 break;
				 
				 case 2:
					 if(st.empty())
					 {
						 System.out.println("Object is Empty..");
					 }
					 else {
						 st.pop();
						 System.out.println(st.toString());
						 
					 }
					 break;
				 case 3:
					 if(st.empty())
					 {
						 System.out.println("Object is Empty...");
					 }
					 else {
						 st.peek();
						 System.out.println("Peek() Element:"+st.toString());
					 }
					 break;
				 case 4:
					 if(st.empty()) {
						 System.out.println("Object is Empty...");
					 }
					 else {
						 System.out.println("Enter to serch element:");
						 Integer ele=new Integer(s.nextInt());
						 int n=st.search(ele);
						 if(n>0)
						 {
							 System.out.println(ele+ "font at position  "+n);
						 }
						 
					 }
				 case 5:
					 System.out.println("Operation Stopped..");
					 System.exit(0);
					 
					 default:
					 
						 System.out.println("Invalid choice..");
					 
					 
					 
				 }//end of switch
				 
				}//end of loop
				
				
				
				
				
				
				
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
		}//try end with resource
	}
	

}

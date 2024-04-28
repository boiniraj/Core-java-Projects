package p1;
import java.util.Scanner;
public class ReadDetails
{
	public Student st;
	public ReadDetails(Student st)
	{
		this.st=st;
	}
	public void read(Scanner s)
	{
		System.out.print("Enter Roll No: ");
	     st.rollno =Integer.parseInt(s.nextLine());
	    System.out.print("Enter Student Name: ");
	     st.name = s.nextLine();
	    System.out.print("Enter Branch: ");
	     st. br = s.nextLine();
	    System.out.print("Enter House No: ");
	     st.ad. hno = s.nextLine();
	    System.out.print("Enter Street Name: ");
	     st.ad.sname = s.nextLine();
	    System.out.print("Enter City: ");
	    st.ad. city = s.nextLine();
	    System.out.print("Enter State: ");
	     st.ad. state = s.nextLine();
	    System.out.print("Enter Pincode: ");
	    st.ad. pincode =Integer.parseInt (s.nextLine());
	    System.out.print("Enter Email: ");
	    st.ct. mid = s.nextLine();
	    System.out.print("Enter Phone Number: ");
	    st.ct. phno = s.nextLong();
	    System.out.print("Enter 6 subjects Marks: ");
	    int i=1;
	    while(i<=6)
	    {
	    	System.out.println("Enter the marks sub"+i);
	    	int sub =s.nextInt();
	    	st.rs.totmarks=st.rs.totmarks+sub;
	    	i=sub;
	    	if(i<=34)
	    	{
	    		System.out.println("Fail");
	    	}
	    	i++;
	    	
	    
	
	    }//end loop
	 
	    st.rs. perse =(float)st.rs.totmarks/6;
	    
	}
}
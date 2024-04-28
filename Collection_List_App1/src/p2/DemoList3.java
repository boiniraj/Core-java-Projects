package p2;
import p1.Student;
import java.util.*;
public class DemoList3 {
	public static void main(String[] args)
	{ 
		Scanner s=new Scanner(System.in);
		ArrayList<Student> ob=new ArrayList<Student>();
		try(s;)
		{
			try {
				System.out.println("Enter the student Details...");
				  System.out.println(" Enter the Student Code:");
				  String sc=s.nextLine();
				  System.out.println("Enter the Student Name:");
				  String sn=s.nextLine();				 
				  System.out.println("Enter the Student Branch:");
				  String sb=s.nextLine();
				  System.out.println("Enter the student totMarks:");
				  int sm=Integer.parseInt(s.nextLine());					 
				  System.out.println("Enter the Student Persentage:");
				  float sp=Float.parseFloat(s.nextLine());
				  System.out.println("Enter the Student result:");
				  float sr=Float.parseFloat(s.nextLine());
				  ob.add(new Student(sc,sn,sb,sm,sp,sr));
				  System.out.println("Student Details...");
				  Iterator<Student> it=ob.iterator();
				  it.forEachRemaining((k)->{
					  System.out.println(k+" ");
				  });
					
			}
			catch(Exception e) {e.printStackTrace();}
			
		}//try end with resource
		
		

	}

}

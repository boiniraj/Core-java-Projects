package p2;
import java.util.Scanner;
import p1.*;
public class StudentDetails
{
	public static void main(String args[])
	{
	Scanner s=new Scanner(System.in);
	Student st =new Student();
	ReadDetails rd=new ReadDetails(st);
	DisplayDetails sd=new DisplayDetails(st);

    rd.read(s);
    sd.dis();
    s.close();
    
}
}
	
	



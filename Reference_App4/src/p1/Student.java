package p1;

public class Student
{
	public int rollno;
	public String name;
	public String br;
	public Address ad=new Address();
	public Contact ct=new Contact();
	public Result rs=new Result();
	public void getstudent()
	{
		System.out.println("**Student**");
		System.out.println("Rollno"+rollno);
		System.out.println("Student Name"+name);
		System.out.println("Branch"+br);
	}

}

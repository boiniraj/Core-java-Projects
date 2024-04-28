package p1;

public class Employee
{
	
	public String name,role,id;
	 public Addres ad=new Addres();
	 public Contact ct=new Contact();
	public void getEmployee()
	{
		System.out.println("** employee Details***");
		System.out.println("Id:"+id);
		System.out.println("Name:"+name);
		System.out.println("Role:"+role);
	}

}

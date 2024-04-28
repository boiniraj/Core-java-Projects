package p1;
public class Employe extends Object implements Cloneable
{
	public String id,name;
	public Address1 ad=new Address1();
	public String toString()
	{
		return "Id:"+id+"\nname:"+name;
		
	}
	public Object getRef1() throws CloneNotSupportedException
	{
		Object o=super.clone();
		return o;
		
	}

}

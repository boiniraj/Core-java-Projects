package p1;

public class DisplayDetails 
{
	public Student st;
	public DisplayDetails(Student st)
	{
		this.st=st;
	}
	public void dis()
	{
		st.getstudent();
		st.ad.getaddres();
		st.ct.getcontact();
		st.rs.getResult();
	}

}

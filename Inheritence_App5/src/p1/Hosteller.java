package p1;

public class Hosteller extends Student
{
	public double hostelfee=30000;
	public String displayDetails()
	{
		return "HostelFee="+hostelfee+"\nName"+name+"\nStudentId="+Studentid+"\nExamfee="+examFee;
		
	}
	public double payFee(int amt)
	{
			return amt-(hostelfee+examFee);
		}
	}




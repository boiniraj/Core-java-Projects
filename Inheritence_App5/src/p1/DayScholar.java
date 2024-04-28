package p1;

public class DayScholar extends Student
{
	public  double trancfee=25000;
	public String displayDetails()
	{
		return "TransportFee="+trancfee+"\nNname="+name+"\nStudentId="+Studentid+"\nExamFee="+examFee;
		
	}
	public double payFee(int amt)
	{
		return amt-(trancfee+examFee);
	}

}

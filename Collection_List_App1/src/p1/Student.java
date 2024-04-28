package p1;
public class Student 
{
	public String Rollno,Name,Branch;
	public int totMarks;
	public float Perse;
	public float resul;
	public Student(String Rollno,String Name,String Branch,int totMarks,float perse,float resul)
	{
		this.Rollno=Rollno;
		this.Name=Name;
		this.Branch=Branch;
		this.totMarks=totMarks;
		this.Perse=Perse;
		this.resul=resul;
	}
	public String toString()
	{
		return Rollno+"\n\t1"+Name+"\n\t2"+Branch+"\n\t3"+totMarks+"\n\t4"+Perse+"\n\t5"+resul;
		
	}
	
	

}

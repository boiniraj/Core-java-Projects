package p1;

public class StudentValues extends Object
{
	
		public String name,branch,result;//instance variables
		
		public int totMarks;
		public float per;
		
		public StudentValues(String name,String branch,int totMarks,float per, String result)//local variables
		{
			
			this.name=name;
			this.branch=branch;
			this.totMarks=totMarks;
			this.per=per;
			this.result=result;
			
			
		}
		public String toString()// public java.lang.String toString();this method is Object Class method
		{
			return name+"\t"+branch+"\t"+totMarks+"\t"+per+"\t"+result;
			
		}

	}



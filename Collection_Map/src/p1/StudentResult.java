package p1;

public class StudentResult 
{
	public String generate(float per)
	{
		if(per>=70 && per<=100) return "distiction";
		else if(per>=60 && per<70) return "FirstClass";
		else if(per>=50 && per<60) return "SecondClass";
	    else if(per>=35 && per<50) return "ThirdClass";
		return "fail";
	}
	

}

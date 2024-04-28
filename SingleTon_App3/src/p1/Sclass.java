package p1;
public class Sclass 
{
	public static ITest getRef()
	{
		//Anonymous innerClass
		ITest ob=new ITest()
	       {
			public double cal(double m)
			{
				
		
			 return Math.sqrt(m);
			}
		   };
		   return ob;
	}

}

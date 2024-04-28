//InnerClases in AbstractClass

package p1;
public abstract class Aclass
{
	public class Subclass1
	{
		public static void m2(int b)
		{
			System.out.println("***InnterClasses instance class static m2() in Abstract class***");
			System.out.println("The value b:"+b);
		}
		public void m3(int c)
		{
			System.out.println("***InnerClasses instance method m3() in Abstract class***");
			System.out.println("The value c:"+c);
		}
			
		}//innerClass instance class
	    public static class Subclass2
	    {
	    	public void m4(int d)
	    	{
	    		System.out.println("***Innerclass staticclass instance m4()in Abstract Class*** ");
	    		System.out.println("The value d"+d);
	    	}
	    	public static void m5(int e)
	    	{
	    		System.out.println("***Innerclass staticclass static m4()in Abstract Class*** ");
	    		System.out.println("The value e"+e);
	    		
	    	}
	    }//innerClass Static class
	  
		
		
	}//outer Abstract class



package p2;
import p1.Pclass;
import p1.ITest;
public class DemoAnonymus1
{
	public static void main(String[] args)
	{
		System.out.println("**Anonymous class extention**");
		Pclass ob=new Pclass()//Pclass class object creation
				{
			      public void m1(int a)//over-ride method
			      {
			    	  System.out.println("**Override method Pclass m1()");
			    	  System.out.println("Value a:"+a);
			      }
			      public void m3(int c)//non-over ride method
			      {
			    	  System.out.println("**Non-Override mrthod**");
			    	  System.out.println("Value c:"+c);
			      }
				};
				ob.m1(10);
				ob.m2(20);
				//ob.m3(30);//error non-override method cannot  access	
		        System.out.println("**Anonymous class implementation**");
		        ITest ob1=new ITest()//interface object creation
		        		{
		        	     public void m4(int f)
		        	     {
		        	    	 System.out.println("**Implemented m4()**");
		        	    	 System.out.println(" Value f:"+f);
		        	     }
		        	     public void m6(int g)//Non-Implemented method
		        	     {
		        	    	 System.out.println("**Nonimplemented**");
		        	    	 System.out.println("Value g:"+g);
		        	     }
		        		};
		        		ob1.m4(30);
		        		ob1.m5(40);
		        		//ob1.m6(50);//non implemented method cannot access  
	}

}

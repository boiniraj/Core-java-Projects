package p2;
import p1.*;
public class DemoInnerAbstractclass
{
	public static void main(String[] args)
	{ 
	Subclass b1=new Subclass()//outer class object creation
				{
			
				};	
	Subclass.Aclass ob2= b1.new Aclass()//inner Instance Abstract class object creation
				{
			    public void m1(int a)
			   {
			    System.out.println("***InnerAbstractClass In Class*** ");
				System.out.println("The Value a:"+a);
			    }
				};
				ob2.m1(22);
				Subclass.Aclass2 ob3= new Subclass.Aclass2()//Inner static abstract class object creation
					{
			        public void m2(int c)
			        {
			         System.out.println("***InnerAbstractClass In Class*** ");
			         System.out.println("The value b:"+c);
			           }
					   };
						ob3.m2(33);
				
	
								ITest.Aclass1 ob6= new ITest.Aclass1()
								{
								 public void m1(int x)
								{
							
								System.out.println("InnerAbstrcatClass in Interface");
								System.out.println("The value x:"+x);	
								}
			
	                            };
	                            ob6.m1(200);
	                            ITest.Aclass2 ob7=new ITest.Aclass2()
	                            {
	                            public void m2(int y)
	                            {
	                            		
	                            System.out.println("InnerAbstractClass In Interface");
	                            System.out.println("The value y:"+y);	
	                            }	                            		                            	
	                            };
	                            ob7.m2(300);
	                            Aclass ob10=new Aclass()
	                            		{
	                            	
	                            		};
	                            Aclass.Aclass4 ob8= ob10.new Aclass4()
	                            		{
	                            	public void m5(int d)
	                            	{
	                            		System.out.println("**InnerAbstractClass in Abstract class**");
	                            		System.out.println("The Value d:"+d);
	                            	}
	                            		};
	                            		ob8.m5(400);
	                            		Aclass.Aclass5 ob9=new Aclass.Aclass5()
	                            		{
	                            			public void m6(int e)
	                            			{
	                            				System.out.println("**InnerAbstractClass In AbstractClass**");
	                            				System.out.println("The value e:"+e);
	                            			}																						
										};
										ob9.m6(500);
	                            		
									
									
}
}



package p2;
import p1.Aclass;
import p1.ITest;
public class DemoinnerclassInterface 
{
	public static void main(String[] args)
	{
		//OuterInterface_name.Innerclass_name ob=new OuterInterface_name.Innerclass_name
		ITest.Subclass ob= new ITest.Subclass();
		ob.m1(22);//object_name.method_name;
		
		
		Aclass ob1= new Aclass()//outer Abstract class object Creation
				{
			
				};
				Aclass.Subclass1 ob3=ob1.new Subclass1();//instance InnerClass object creation 
				Aclass.Subclass1.m2(55);
				ob3.m3(44);
				Aclass.Subclass2 ob4=new Aclass.Subclass2();//static innerClass object creation
				ob4.m4(66);
				Aclass.Subclass2.m5(88);
		
	}

}

package p1;

public class DemoWrapper2 {

	public static void main(String[] args) {
		//BoxingProcces
		Integer ob1=new Integer(8);
		Integer ob2=new Integer("22");
		Float ob3= new Float(122.2f);
		Float ob4=new Float("5122.22f");
		Float ob5=new Float(122.33);
		Character ob6=new Character('s');
		Boolean ob7=new Boolean(true);
        Boolean ob8=new Boolean("false");
/*
  define AutoUnBoxing process?
=&gt;The UnBoxing process which is performed automatically is known as
AutoUnBoxing process.
=&gt;In AutoUnBoxing process the NonPrimitive datatype variables are
assigned to Primitive datatype variables.*/
		
		
		
		
		//Unboxing process
		int i1=ob1.intValue();
		int i2=ob2.intValue();
		float f1=ob3.floatValue();
		float f2=ob4.floatValue();
		float f3=ob5.floatValue();
		char c=ob6.charValue();
		boolean b1=ob7.booleanValue();
		boolean b2=ob8.booleanValue();
		
		
		
		System.out.println(" Integer value :"+i1);
		System.out.println("Integer value:"+i2);
		System.out.println("Float value :"+f1);
		System.out.println("Float value:"+f2);
		System.out.println("Float value b5:"+f3);
		System.out.println("Character :"+c);
		System.out.println("Boolean :"+b1);
		System.out.println("Boolean :"+b2);
		
		

	}

}

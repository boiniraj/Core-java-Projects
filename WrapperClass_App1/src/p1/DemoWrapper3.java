/*
 define AutoUnBoxing process?
=>The UnBoxing process which is performed automatically is known as
AutoUnBoxing process.
=>In AutoUnBoxing process the NonPrimitive datatype variables are
assigned to Primitive datatype variables.*/


package p1;
public class DemoWrapper3 {

	public static void main(String[] args) {
		//AutoBoxingProcces
		Integer ob1=8;
		Float ob2= 122.2f;
		Character ob3= 's';
		Boolean ob4=true;
		
		//AutoUnboxing process
		int i1=ob1;
		
		float f1=ob2;
		
		char c=ob3;
		boolean b=ob4;
		
		
		
		
		System.out.println(" Integer value :"+i1);
		
		System.out.println("Float value :"+f1);
		
		System.out.println("Character :"+c);
		System.out.println("Boolean :"+b);
		
		
		

	}

}

package p1;

public interface ITest4 
{
	
 public static void m2(int b)//static concrete method
 {
	 System.out.println("***static concreate method***");
	 System.out.println("Value a:"+b);
 }
 public default void m3(int c)//default concrete method
 {
	 System.out.println("***Default concreate method***");
	 System.out.println("Value c:"+c);
 }

}

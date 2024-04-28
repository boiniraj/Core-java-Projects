//(Demonstrating Method references is Threads)

package p2;
import p1.*;
public class DemoThread10 {
	public static void main(String[] args) 
	{ 
		new Thread(Task1 :: dis1).start();
		new Thread(Task2 :: dis2).start();
		
	}
}

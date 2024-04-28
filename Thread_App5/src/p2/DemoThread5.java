package p2;
import p1.*;
public class DemoThread5 {
	public static void main(String[] args)
	{
		Producer ob1=new Producer();
		Consumer ob2=new Consumer(ob1);
		Thread t1=new Thread(ob1);
		Thread t2=new Thread(ob2);
		t1.start();
        t2.start();
        t2.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
	

	}

}

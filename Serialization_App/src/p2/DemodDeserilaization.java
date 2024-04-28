package p2;
import p1.*;
import java.util.*;
import java.io.*;
public class DemodDeserilaization {
	public static void main(String[] args)
	{
		 try{
		FileInputStream fis=new FileInputStream("C:\\Users\\RAJKUMAR\\OneDrive\\New folder\\ob1.txt");
		ObjectInputStream obi= new ObjectInputStream(fis);
		User ob2=(User)obi.readObject();
		System.out.println("==UserDetails===");
		System.out.println(ob2.toString());
		 }catch(Exception e)
		 {
			 e.printStackTrace();
		 }

	}

}

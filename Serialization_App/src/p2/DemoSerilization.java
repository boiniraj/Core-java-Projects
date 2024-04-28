package p2;
import p1.*;
import java.util.*;
import java.io.*;
public class DemoSerilization 
{

	public static void main(String[] args)
	{
		 Scanner s=new Scanner(System.in);
		 try(s;){
			 System.out.println("Enter The UserName:");
			 String uN=s.nextLine();
			 System.out.println("Ente the Mail Id");
			 String uM=s.nextLine();
			User ob1=new User(uN,uM,new Date());
			FileOutputStream fos=new FileOutputStream("C:\\Users\\RAJKUMAR\\OneDrive\\New folder\\ob1.txt");
			ObjectOutputStream obop=new ObjectOutputStream(fos);
			  obop.writeObject(ob1);
			  System.out.println("Object stored Succesfull..");
			  fos.close();
			  obop.close();
			
		 }catch(Exception e)
		 {
			e.printStackTrace();
		 }
		

	}

	
		
	}



package p2;
import java.util.*;
import p1.Product;
public class DemoMap2 
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		try(s;){
			try {
				Map<String,Product> ob1=null;
				
				ob1= new HashMap<String,Product>(); //ob=new HashMap<String,Product>();
				System.out.println("Enter the Pcode:");
				String pcode=s.nextLine();
				System.out.println("Enter the product Name:");
				String Pname=s.nextLine();
				System.out.println("Enter the product Price:");
				float Pprice=Float.parseFloat(s.nextLine());
				System.out.println("Enter the product Qty:");
				int qty=Integer.parseInt(s.nextLine());
				ob1.put(new String(pcode), new Product(Pname,Pprice,qty));
				System.out.println("**ProductDetails**");
				ob1.forEach((k,p)->{
					System.out.println(k+"\t"+p);
					
				});
				System.out.println("**Key Values**");
				Set<String> ks=ob1.keySet();
				ks.forEach((k)->{
					System.out.println(k);
				});
				System.out.println("Enter the code to get Details..");
				String pcode1=s.nextLine();
				Product pc=ob1.get(pcode1);
				System.out.println(pc.toString());
				System.out.println();
				
				System.out.println("pruduct Values..");
				Collection<Product> pv=ob1.values();
				pv.forEach((k)->{
					System.out.println(k);
				});
				
				System.out.println("Enter the code to remove:");
				String s1=s.nextLine();
				      ob1.remove(s1);
				      ob1.forEach((k,v)->{
				    	  System.out.println(k+"\t"+v);
				      });
				
				
				
				
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
			
			
			}//end with resource
		}
		

	}



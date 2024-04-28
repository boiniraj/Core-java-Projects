package p2;
import p1.StudentResult;
import p1.StudentValues;
import java.util.*;

public class DemoMap1
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		try(s;)
		{
			try {
		Map<String,StudentValues> ob=null;
		String nm=null;
		
		while(true)
		{
			System.out.println("Choice");
			System.out.println("\t1.HashMap"+"\n\t2.LinkedHashMap"+"\n\t3.TreeMap"+"\n\t4.Hashtable"+"\n\t5.Exit");
			System.out.println("Enter the choice");
			
			switch(Integer.parseInt(s.nextLine()))
			{
			case 1:
				ob=new HashMap<String,StudentValues>();
				nm="HashMap";
				break;
			case 2:
				ob=new LinkedHashMap<String,StudentValues>();
				nm="LinkedHashMap";
				break;
			case 3:
				ob=new TreeMap<String,StudentValues>();
				nm="TreeMap";
				break;
			case 4:
				ob= new Hashtable<String,StudentValues>();
				nm="Hashtable";
				break;
			case 5:
				System.out.println("Operation Stoped..");
				System.exit(0);//public static void exit(int);//public final class java.lang.System {
			   //System is static final class this class one method is exit(int);
				//this is sataic class because call to class name 
			default:
				System.out.println("Invalid Choice");
				break;
			
			}//end switch
			
			xyz:while(true)
			{
				System.out.println("Select Operation..");
				System.out.println("\t1.put(K,V)"+"\n\t2.remove(Object)"+"\n\t3.get(Object)"+"\n\t4.keySet()"+"\n\t5.values()"+"\n\t6.Exit");
				System.out.println("Enter the Choice:");
				
				switch(Integer.parseInt(s.nextLine()))
				{ 
				case 1:
					System.out.println("Enter the roll NO:");
					String rNo=s.nextLine();
					System.out.println("Enter the name: ");
					String name=s.nextLine();
					System.out.println("Enter the Branch:");
					String branch=s.nextLine();
					System.out.println("Enter the 6 sub Marks:");
					int i=1,totM=0;
					while(i<=6)
					{
						System.out.println("Enter the Sub:"+i);
						int sub=Integer.parseInt(s.nextLine());
						totM=totM+sub;
						i++;
						
					}//end loop

					float per=(float)totM/6;
					System.out.println("Enter the Resuly:");
					String result=new StudentResult().generate(per);
				    ob.put(new String(rNo),new StudentValues(name,branch,totM,per,result));
				    System.out.println("***StudentDetails***");
				    ob.forEach((p,q)->{
				    	System.out.println(p+"\t"+q);
				    	
				    });
					break;
				case 2:
					if(ob.isEmpty())
					{
						System.out.println("Map is Empty..");
					}
					else {
					
						System.out.println("Enter the rNo to remove Details:");
						String rNo1=s.nextLine();
						if(ob.containsKey(rNo1))
						{
							ob.remove(rNo1);
							System.out.println("**StudentDetails**");
							ob.forEach((p,q)->{
						    	System.out.println(p+"\t"+q);
						    	
						    });
							
						}
						else {
							System.out.println("RollNo not found...");
						}
						
					}
					
					
					break;
				case 3:
					if(ob.isEmpty())
					{
						System.out.println("Map is Empty..");
					}
					else
					{
						System.out.println("Enter the rolNo get the details:");
						String rolNo2=s.nextLine();
						if(ob.containsKey(rolNo2))
						{
							StudentValues sv=ob.get(rolNo2);
							System.out.println(sv.toString());
						}
						else {
							System.out.println("RollNo not found..");
						}
					}
					break;
				case 4:
					if(ob.isEmpty())
					{
						System.out.println("Map is Empty");
					}
					else {
						Set<String> ks=ob.keySet();
						System.out.println("**Keys**");
						ks.forEach((k)->{
							System.out.println(k);
							
						});
						
					}
					break;
				case 5:
					if(ob.isEmpty())
					{
						System.out.println("Map is Empty..");
					}
					else {
						Collection<StudentValues> vs=ob.values();
						System.out.println("***Values()***");
						vs.forEach((k)->{
							System.out.println(k);
							
						});
					}
					
				case 6:
					System.out.println("Operation Stopped on"+nm);
					
				  break xyz;
				  default:
					  System.out.println("Invalid choice..");
				 
				
				}//end switch
				
				
			}//inner loop
			
		}//end loop
		
			}
			catch(Exception e)
			{
				e.printStackTrace();
				
			}
	}//try end with resource
	}
}

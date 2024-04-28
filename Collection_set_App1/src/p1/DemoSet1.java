package p1;
import java.util.*;
public class DemoSet1
{
	@SuppressWarnings("removal")
	public static void main(String[] args)
	{
	Scanner s=new Scanner(System.in);
	try(s;)
	{
		try{
			Set<Integer> ob=null;
			String nm=null;
			while(true)
			{
				System.out.println("***choice:***");
				System.out.println("\t1.Hashset"+"\n\t2.LinkedHashset"+"\n\t3.Treeset"+"\n\t4.Exit");
				System.out.println("Enter the choice:");
				switch(s.nextInt())
				{
				case 1:
					ob=new HashSet<Integer>();
					nm="HashSet";
					break;
				case 2:
					ob= new LinkedHashSet<Integer>();
					nm="LinkedHashSet";
					break;
				case 3:
					ob=new TreeSet<Integer>();
					nm="TreeSet";
					break;
				case 4:
					System.out.println("Operation is Stopped");
					System.exit(0);
					default:
						System.out.println("Invalid choice");
						continue;
				
				     }//end of switch
				System.out.println("Perform operations on"+nm);
				xyz:while(true)
				{
					System.out.println("**Choice**");
					System.out.println("\t1.add(E)"+"\n\t2.remove(Object)"+"\n\t3.Exit()");
					System.out.println("Enter the choice:");
					switch(s.nextInt())
					{
					case 1:
						System.out.println("Enter the element:");
						ob.add(new Integer(s.nextInt()));
						System.out.println("element is"+ob.toString());
						break;
					case 2:
						if(ob.isEmpty())
						{
						System.out.println(nm+"--is empty--");
						}
						else {
							System.out.println("Enter the element to removed:");
						
						
						Integer ob1= new Integer (s.nextInt());
						
						if(ob.remove(ob1))
						{
							System.out.println(ob1+" is removed");
							System.out.println(ob.toString());
						}
						else {
							System.out.println("Element is not removed--");
						}
						}
						break;
					case 3:
						System.out.println(nm+"Operation stopped"+nm);
						break xyz;
						default:
						{
							System.out.println("Invalid choice");
						}
					
					}//end of switch
					
					
					
				}//inside while loop
				
				
			}//loop end
			
			
		}
		catch(Exception e) {e.printStackTrace();}
	}//end of try with resource

	}

}

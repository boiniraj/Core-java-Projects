package p2;
import p1.Product;
import java.util.*;
public class DemoList1 
{
   @SuppressWarnings("unchecked")
public static void main(String[] args)
   {
	   Scanner s=new Scanner(System.in);
	   ArrayList<Product> ob=new ArrayList<Product>();//
	   try(s;)
	   {
		   try
		   {
			   
			   while(true)
			   {
			   System.out.println("*** Choice***");
			   System.out.println("\t1.add(E)"
					           +"\n\t2.add(index,E)"
					            +"\n\t3.remove(Object)"
					           +"\n\t4.remove(index)"+
					            "\n\t5.get(index)"+
					              "\n\t6.set(index, E)"+
					              "\n\t7.SortByCode"
					              +"\n\t8.EditByCode"
					              +"\n\t9.Display"
					              +"\n\t10.Exit");
			   System.out.println("Enter the choice:");
			           switch(Integer.parseInt(s.nextLine()))
			           {
			           case 1:
			        	   System.out.println("**ProductDetails**");
			        	   System.out.println("Enter pCode:");
			        	   String pC=s.nextLine();
			        	   System.out.println("Enter pName:");
			        	   String pN=s.nextLine();
			        	   System.out.println("Enter pPrice:");
			        	   float pP=Float.parseFloat(s.nextLine());
			        	   System.out.println("Enter pQty:");
			        	   int pQ=Integer.parseInt(s.nextLine());
			        	   ob.add(new Product(pC,pN,pP,pQ));
			        	   System.out.println("==productDetails==");
		        		   ob.forEach((k)->		
			        	   {
			        		   System.out.println(k);
			        		   
			        	   });
			                    
			        	   break;
			           case 2:
			        	   if(ob.isEmpty())
			        	   {
			        		   System.out.println("Is Empty");
			        	   }
			        	   else {
			        		   System.out.println("**add the element Index Value**");
			        	   }
			        	   int index=Integer.parseInt(s.nextLine());
			        	   if(index>=0 &&index<ob.size())
			        	   {
			        		   System.out.println("Enter PCode:");
			        		   String pC1=s.nextLine();
			        		   System.out.println("Enter PName:");
			        		   String pN1=s.nextLine();
			        		   System.out.println("Enter pPrice:");
			        		   float pP1=Float.parseFloat(s.nextLine());
			        		   System.out.println("Enter pQ1");
			        		   int pQ1=Integer.parseInt(s.nextLine());
			        		   ob.add(index,new Product(pC1,pN1,pP1,pQ1));
			                    ob.forEach((k)->
			        		   {
			        			  System.out.println(k); 
			        		   });
			        		   
			        	   }
			        	   else {
			        		   System.out.println("Index Invalid");
			        	   }
			        	   break;
			           case 3:
			        	   if(ob.isEmpty())
			        	   {
			        		   System.out.println("is Empty");
			        	   }
			        	   else {
			        		   System.out.println("Enter the product-code to delete:");
			        	   }
			        	   String pcode=s.nextLine();
			        	   Iterator<Product> it=ob.iterator();
			        	   while(it.hasNext())
			        	   { 
			        		   Product p=it.next();
			        		   if(pcode.equals(p.code))
			        		   {
			        			   ob.remove(p);
			        			   System.out.println("product removed..");
			        			   break;
			        		   }
			        		   
			        		   
			        	   }//end of loop
			        	   System.out.println("**product Details**");
			        	   ob.forEach((k)->
			        	   {
			        		   System.out.println(k);
			        		   
			        	        }
			        			   );
			        	  			        	   
			        	   break;
			           case 4:
			        	   if(ob.isEmpty())
			        	   {
			        	   System.out.println("is empty");
			        	   }
			        	   else {
			        		   System.out.println("enter the index to removed:");
			        	   
			        	   int removeind= Integer.parseInt(s.nextLine());
			        	   if( removeind>=0&&removeind<=ob.size())
			        	   {
			        		   ob.remove(removeind);
			        		   System.out.println("product remove...");
			        		   System.out.println("**Product Details**");
			        		   ob.forEach((k)->
			        		   {
			        			   System.out.println(k);
			        			   
			        		   }
			        				   );
			        		   
			        	   }
			        	   else {
			        		   System.out.println("Invalid index");
			        	   }
			        	   }
			        	   break;
			           case 5:
			        	   if(ob.isEmpty())
			        	   {
			        		   System.out.println("Is Empty");
			        	   }
			        	   else {
			        		   System.out.println("enter the index get the details:");
			        		   int getind=Integer.parseInt(s.nextLine());
			        		   if(getind>=0&& getind<=ob.size())
			        		   {
			        			   Product p=ob.get(getind);
			        			   System.out.println(p.toString());
			        			   System.out.println("**productDetails**");
			        			   ob.forEach((k)->
			        			   {
			        				   System.out.println(k);
			        			   }
			        			   );
			        		   }
			        		   else {
			        			   System.out.println("Invalid index");
			        		   }
			        		   
			        	   }
			        	   break;
			           case 6:
			        	   if(ob.isEmpty())
			        	   {
			        		   System.out.println("Is Empty");
			        	   }
			        	   else
			        	   {
			        		   System.out.println("enter the index Replace the item:");
			        		   int repind=Integer.parseInt(s.nextLine());
			        		   if(repind>=0&& repind<=ob.size())
			        		   {
			        			   System.out.println("Enter the pCode:");
			        			   String pc11=s.nextLine();
			        			   System.out.println("Enter the PName:");
			        			   String pn11=s.nextLine();
			        			   System.out.println("Enter the price:");
			        			   float pp11=Float.parseFloat(s.nextLine());
			        			   System.out.println("Enter the Qty:");
			        			   int pq11=Integer.parseInt(s.nextLine());
			        			   ob.set(repind,new Product( pc11,pn11,pp11,pq11));
			        			   System.out.println("**product Details**");
			        			   ob.forEach((k)->
			        			   {
			        				   System.out.println(k);
			        			   });
			        			  
			        			   
			        		   }
			        		   else {
			        			   System.out.println("Invalid index");
			        		   }
			        	   }
			        	   break;
			           case 7:
			        	   if(ob.isEmpty())
			        	   {
			        		   System.out.println("is Empty");
			        	   }
			        	   else {
			        		                                
			        		   Collections.sort(ob);
			        		   //Collections&#39; is a class from java.util package and which provide sort()			        		   method//sorting process
			        		   System.out.println("**ProductDetails***");
			        		   ob.forEach((k)->
			        		   {
			        			   System.out.println(k);
			        			   
			        		   });
			        		  
			        	   }
			        	   break;
			           case 8:
			        	   if(ob.isEmpty())
			        	   {
			        		   System.out.println("is Empty");
			        	   }
			        	   else {
			        		   System.out.println("Edit the Code Perform edit operations:");
			        		   String Pedit=s.nextLine();
			        		   Iterator<Product> it2=ob.iterator();
			        		   while(it2.hasNext())
			        		   {
			        		   Product p=it2.next();
			        		   if(Pedit.equals(p.code));
			        		   System.out.println("Old Price:"+p.price);
			        		   System.out.println("Enter new Price:");
			        		   float pp2=Float.parseFloat(s.nextLine());
			        		   System.out.println("old qty:"+p.qty);
			        		   System.out.println("new Qty:");
			        		   int pq2= Integer.parseInt(s.nextLine());
			        		   p.price=pp2;
			        		   p.qty=p.qty+pq2;
			        		  
			        		   
			        		   
			        		   
			        		   }//inner loop end
			        		   System.out.println("**Product Details***");
			        		   ob.forEach((k)->
			        		   {
			        			   System.out.println(k);
			        			   
			        		   });
			        		   
			        	   }
			        	   break;
			           case 9:
			        	   if(ob.isEmpty())
			        	   {
			        		   System.out.println("Is Empty");
			        	   }
			        	   else {
			        		   System.out.println("***ProductDetails***");
			        		   Spliterator<Product> sp=ob.spliterator();
			        		   sp.forEachRemaining((k)->
			        		   {
			        			 System.out.println(k);  
			        		   });
			        		   
			        	   }
			        	   break;
			           case 10:
			        	   System.out.println("***Operation Stopped***");
			        	   System.exit(0);
			        	   default:
			        		   System.out.println("==Invalid choice==");
			        	   
			        	     
			           }//switch of choice
					    
			   }//end of loop
			   
		   }
		   catch(Exception e) {e.printStackTrace();}
		   
	   }//try end with resource
	   
		
	}

}

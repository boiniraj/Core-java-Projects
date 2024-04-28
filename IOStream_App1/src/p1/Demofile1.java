package p1;
import java.util.*;
import java.io.*;
public class Demofile1 {
	public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      try(s;)
      {
    	  try {
    		  System.out.println("Enter the Source file(fpath&fname):");
    		  File f1=new File(s.nextLine());//The user is prompted to enter the path and name of the source file.
    		  //A File object (f1) is created based on the user input.
    		  if(f1.exists())//check source file exist or not
    		  {
    		  FileInputStream fis=new FileInputStream(f1);//Data read from the source file
    		  
    		  
    		  System.out.println("Enter the distination file(fpath&fname):");   		  
    		  File f2=new File(s.nextLine());
    		  FileOutputStream fos=new FileOutputStream(f2);//fos to write the destination file
    		  int k;//store the byte read from source file
    		  while((k=fis.read())!=-1)//reads byte form "fis" the byte stored in variable k;
   //Checks if the value of k is not equal to -1. In Java, read() returns -1 when the end of the file is reached. 		  
    		  {
    			fos.write(k); //Writes the byte read from the source file (k) to the destination file (fos). 
    		  }//close loop
    		  System.out.println("file Succusfully copied..");
    		  fos.close();
    		  fis.close();
    		  
    		  }//end if
    		  else {
    			  System.out.println("invalid fpath and or fname...");
    		  
    		  }//end else
    		  
    	  }
    	  catch(Exception e)
    	  {
    		  e.printStackTrace();
    	  }
      }//try end with resource

	}

}

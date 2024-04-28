package p1;
import java.io.*;
import java.util.*;
public class Demofile2 {

	public static void main(String[] args) 
	{
		try {
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			FileWriter fw=new FileWriter("C:\\Users\\RAJKUMAR\\OneDrive\\New folder\\obj.txt");
			char ch;
			System.out.println("Enter the data until @ at end:");
			while((ch=(char)br.read())!='@')
			{
				fw.write(ch);
			}
			System.out.println("Data stored succusfully..");
			fw.close();
			br.close();
			System.out.println("Dispaly the data");
			FileReader fr=new FileReader("C:\\Users\\RAJKUMAR\\OneDrive\\New folder\\obj.txt");
			int k;
			while((k=fr.read())!=-1)
			{
				System.out.println((char)k);
			}
			fr.close();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		

	}

}

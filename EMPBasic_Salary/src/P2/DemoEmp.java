package P2;
import java.util.Scanner;
import P1.EmpSalary;
public class DemoEmp
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the EmpBSal:");
		int bSal = s.nextInt();
		System.out.println("Enter the Emp-HRA:");
		int hra = s.nextInt();
		System.out.println("Enter the Emp-DA:");
		int da = s.nextInt();

		EmpSalary ob = new EmpSalary();
		ob.cal(bSal, hra, da);
		float res = ob.getTotSal();
		System.out.println("Emp-TotSal:"+res);
		s.close();
	}
		

	}



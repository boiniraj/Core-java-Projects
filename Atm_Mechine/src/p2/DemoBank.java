package p2;
import p1.*;
import java.util.Scanner;
public class DemoBank
{
	public static void main(String []args)
	{
		Scanner s=new Scanner(System.in);
		int count=0;
		pqr:while(true)
		{
			System.out.println("Enter the pinNo:");
			int pinNo=s.nextInt();
			if(pinNo>=1000&&pinNo<=9999)
			{
				if(pinNo==1111 || pinNo==2222||pinNo==3333)
				{
					System.out.println("**Choice**");
					{
						System.out.println("\t1.withdraw"+"\n\t2.Deposit");
						System.out.println("Enter the choice:");
						int choice=s.nextInt();
						switch(choice)
						{
						case 1:
							System.out.println("Enter the amt for withdraw:");
							int a1=s.nextInt();
							if(a1>0&&a1%100==0)
							{
								if(a1<=2000)
								{
									Withdraw wd=new Withdraw();
									wd.wDraw(a1);
									
								}
								else
								{
									System.out.println("Insufficient fund..");
									
								}
							}
							
							else
							{
								System.out.println("Invalid amt...");
							}
							break pqr;//stop the loop
						case 2:
							System.out.println("Enter the deposite Amt:");
							int a2=s.nextInt();
							if(a2>0&&a2%100==00)
							{
								Deposite dp=new Deposite();
								dp.deposite(a2);
								
							}
							else
							{
								System.out.println("Invalid amt..");
								
							}
							break pqr;//stop the loop
							default:
								System.out.println("Invalid choice..");
								break pqr;
						}//end of switch
					}
				}
					else
					{
						System.out.println("pinNo donot exit..");
						count++;
					}
				
				}
			else
			{
				System.out.println("Invalid pinNo..");
				count++;
			}
			if(count==3)
			{
				System.out.println("Transaction blocked...");
				break;//stop the loop
			}
			}//end loop
		
}
}

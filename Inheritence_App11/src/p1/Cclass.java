package p1;
public class Cclass extends Pclass
{
   public static void dis(int k,int r,int j)
   {
	   System.out.println("***Cclass***");
	   System.out.println("j:"+j);
   }
   public static void dis(int k,int r,int j,int l)
   {
	   System.out.println("***Cclass***");
	   System.out.println("l:"+l);
   }
   public void acces(int k,int r,int j,int l)
   { 
	   this.dis(k);
	   super.dis(k,r);
	   this.dis(k,r,j);
	   this.dis(k,r,j,l);
   }
 
}


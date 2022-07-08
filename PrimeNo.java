package corejavapart1;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
       System.out.println("enter number=");
       int n=sc.nextInt();
       boolean flag=true;
       for(int i=2;i<n;i++)
       {
    	   if(n%i==0)
    	   {
    		   flag=false;
    		   break;
    	   }
       }
       if(flag)
       {
       System.out.println("no is prime");
       }
       else
    	{
    	   System.out.println("no is not prime");
    	};
	}

}

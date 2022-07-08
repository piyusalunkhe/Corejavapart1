package corejavapart1;

import java.util.Scanner;

public class  PrimeNousingcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter number=");
       int n=sc.nextInt();
       int count=0;
       for(int i=1;i<=n;i++)
       {
    	   count++;
       }
       if(count==2)
       {
    	   System.out.println("prime number");
    	   
       }
       else
       {
    	   System.out.println("not prime number");
       }
	}
    //Prime number between 1 to n
	
}

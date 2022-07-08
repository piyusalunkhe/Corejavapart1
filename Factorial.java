package corejavapart1;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int i ;
		int fact=1;
		System.out.println("Enter number=");
		int n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of number ="+fact);
		while(n<=i)
		{
			fact =fact*i;
		}
      System.out.println("Factorial of number ="+fact);
	}

}

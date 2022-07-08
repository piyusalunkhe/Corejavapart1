package corejavapart1;

import java.util.Scanner;

public class PolindromeNo {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int rev=0,r=0;
		int num = 0;
		int originalnum=num;
		System.out.println("Enter number =");
		int num1=sc.nextInt();
		while(num1!=0)
		{
			r=num1%10;
			rev=rev*10+r;
			num1=num1/10;
		}
		System.out.println("Reverse no is"+rev);
		if(rev==originalnum)
		{
			System.out.println("number is polindrome");
			
		}
		else
		{
			System.out.println("number is not polindromr");
		}
	}

}

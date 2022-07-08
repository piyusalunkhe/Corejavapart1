package corejavapart1;

import java.util.Scanner;

public class ReverseNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc =new Scanner(System.in);
    int rev=0;
    int r;
    System.out.println("Enter Number=");
    int n=sc.nextInt();
    while(n!=0)    {
    	r=n%10;
    	rev=rev*10+r;
    	n=n/10;
    	
    }
    System.out.println("Reverse number is "+rev);
	}

}

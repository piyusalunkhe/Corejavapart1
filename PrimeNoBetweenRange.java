package corejavapart1;

import java.util.Scanner;

public class PrimeNoBetweenRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int i,j;
		System.out.println("enter input=");
		int n=sc.nextInt();
		for( i=1;i<=n;i++)
			
		{
			for(j=2;j<=i;j++)
				{
				   
			        if(i%j==0)
			        break;
			     }
			if(j==i)
				System.out.println(j);
		}
		
		
		
		
			

	}

}

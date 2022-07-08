package corejavapart1;

import java.util.Scanner;

public class RightTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//for print pattern
        for(int i=1;i<=5;i++)
		{
        	//for space 
			for(int j=i;j<5;j++)
			{
				System.out.println("  ");
			}
			//for pattern
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
		
		System.out.println();
		}
	}

}

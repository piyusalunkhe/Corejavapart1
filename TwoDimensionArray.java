package corejavapart1;

import java.util.Scanner;

public class TwoDimensionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int [][]num=new int [2][2];
		int [][]num1=new int [2][2]; 
		int [][]c=new int[2][2];
		System.out.println("Enter first Array Elements=");
		for(int i=0;i<2;i++)//row
		{
			for(int j=0;j<2;j++)//column
			{
				num[i][j]=sc.nextInt();
			}
		}
		System.out.println("Matrix :");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(num[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Enter second array elements=");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				num1[i][j]=sc.nextInt();
			}
		}
		System.out.println("Matrix:");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(num1[i][j]+" ");
				
			}
			System.out.println();
		}
		System.out.println("Sum of matrix is:");
		for(int i=0;i<2;i++)
		{
			
			for(int j=0;j<2;j++)
			{
				
				c[i][j]=num[i][j]+num1[i][j];
				System.out.print(" " +c[i][j]);
			}
			System.out.println();
		}

	}

}

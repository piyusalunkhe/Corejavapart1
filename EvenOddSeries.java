package corejavapart1;

import java.util.Scanner;

public class EvenOddSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Even numbers are:");
    for( i =1;i<10;i++)
    {
    	if(i%2==0)
    	{
    		 System.out.println(i);
    	}
    	
    	
	}
    System.out.println("Odd Numbers are:");
    for( i =1;i<10;i++)
    {
    if(i%2!=0)
	{
		System.out.println(i);
	
	}
    }

    
    
	}

}

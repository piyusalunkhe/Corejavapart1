package corejavapart1;

import java.util.Scanner;

public class ArrrayOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       int c1=0,c2=0,c3=0;
       int num[]=new int[5];
       System.out.println("Element in array are :");
       for(int i=0;i<num.length;i++)
       {
    	   num[i]=sc.nextInt();
       }
       for(int i=0;i<num.length;i++)
       {
    	   if(num[i]>0)
    	   {
    		 System.out.println(num[i] + " ");
    		   c1++;
    	   }
    	   else if(num[i]<0)
    	   {
    		   System.out.println(num[i] + " ");
    		   c2++;
    	   }
    	   else
    	   {
    		   System.out.println(num[i] + " ");
    		   c3++;
    	   }
       }
       
       System.out.println("Positive number count="+c1);
       System.out.println("Negative Number count="+c2);
       System.out.println("Zero Number count="+c3);
       
	}

}

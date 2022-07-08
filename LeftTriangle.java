package corejavapart1;

import java.util.Scanner;

public class LeftTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc =new Scanner(System.in);
     int n=6;
     for(int i=1;i<=n;i++)
      {
    	  for(int j=1;j<=i;j++)
    	  {
    	  System.out.print("*");    	
    	  }
    	  System.out.println();
      }
      //for reverse Star
      int n1=6;
      for(int i=1;i<=n1;i++)
      {
    	  for(int j=6;j>=i;j--)
    	  {
    		  System.out.print("*");
    	  }
    	  System.out.println();
      }
      
    	  
    	   
	}

}

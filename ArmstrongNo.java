package corejavapart1;

import java.util.Scanner;

public class ArmstrongNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      int sum=0;
      int rev=0;
      int input=0;
       int temp= input;
      System.out.println("Enter input =");
      int input1=sc.nextInt();
      while(input1!=0)
      {
    	  rev=input1%10;
    	  sum=sum+(rev*rev*rev);
    	  input1=input1/10;
      }
      System.out.println("sum"+sum);
      int result=sum;
      System.out.println("result :"+result);
      if(result==temp)
      {
    	  System.out.println("number is a armstrong ");
      }
      else
      {
      System.out.println("number is not armstrong ");
      }
	}

}

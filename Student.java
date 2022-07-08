package corejavapart1;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      String name="Priyanka";
     int a,b,c;
     int avg=0;
     System.out.println("enter a=");
     a=sc.nextInt();
     System.out.println("enter b=");
     b=sc.nextInt();
     System.out.println("enter c=");
     c=sc.nextInt();
     avg=((a+b+c)/3);
     System.out.println("Average of priyanka marks is :"+avg);
     if((avg>90)&&(avg>80))
     {
    	 System.out.println("grade A");
     }
     else if((avg>60)&& (avg>50))
     {
    	 System.out.println("Grade B");
     }
	}

}

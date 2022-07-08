package corejavapart1;

import java.util.Scanner;

public class CountString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the string:");
         String str=sc.nextLine();   //welcome to java
		int words=1;
		int characters=1;
		for(int i=0;i<str.length()-1;i++)
			{
			char ch=str.charAt(i);
			if(str.charAt(i)==' '&&str.charAt(i+1)!=' ')
			{
				words++;
			}
			else if(str.charAt(i)!=' ')
			{
				characters++;
			}
			}
		  int i=1;
		System.out.println("\nTotal words:"  +words);
		  System.out.println("\nTotal characters:" +characters);
		  System.out.println("\nTotal space:"+(words-1));
		  
		}

}

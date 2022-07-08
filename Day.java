package corejavapart1;

import java.util.Scanner;

public class Day {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter input=");
		int a=sc.nextInt();
		String Day;
		switch(a)
		{
		case 1:
			Day="Monday";
			System.out.println("Day is "+Day);
	        break;
		case 2:
			Day="Tuesday";
			System.out.println("Day is"+Day);
			break;
		case 3:
			Day="Wendesday";
			System.out.println("Day is"+Day);
			break;
		case 4:
			Day="Thirsday";
			System.out.println("Day is"+Day);
		
			break;
		case 5:
			Day="Friday";
			System.out.println("Day is "+Day);
			break;
		case 6:
			Day="Saturday";
			System.out.println("Day is"+Day);
			break;
		case 7:
			Day="Sunday";
			System.out.println("Day is "+Day);
			break;
			default:
				Day="Invalid Day";
				System.out.println("Invalid Day"+Day);
				}
		
		

	}

}

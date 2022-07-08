package corejavapart1;

import java.util.Scanner;

public class ArrayInAccending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     int num[]= new int[5];
     System.out.println("Enter element in array:");
     for(int i=0;i<num.length;i++)
     {
    	 num[i]=sc.nextInt();
     }
     for(int i=0;i<num.length;i++)
     {
    	 for(int j=i+1;j<num.length;j++)
    	 {
    		 if(num[i]>num[j])
    		 {
    			 int temp=num[i];
    			 num[i]=num[j];
    			 num[j]=temp;
    		 }
    	 }
     }
     System.out.println("\nSorted array :");
     for(int i=0;i<5;i++)
     {
     System.out.print(num[i]+ " ");
     }
     //Binary Search
    // int first = 0;
     //int last=num.length-1;
     //System.out.println("\nEnter element want to search:");
     //int search=sc.nextInt();
     //int mid =(first + last)/2;
     //while(first<=last)
     {
    	// if(num[mid]==search)
    	 {
    		// System.out.println("element fount at index:"+mid);
    	     //break;
    	 }
    	 //else if (num[mid ]< search) {
    		// first = mid+1;
    	// }else
    //	 {
    	//	 last=mid-1;
    	 //}
    	 //mid =(first+last)/2;
     }
     //if(first>last)
     {
    	// System.out.println("Element are not found");
     }
     System.out.println("\nEnter search element :");
     int n=sc.nextInt(); 
     int i=0;
     for( i=0;i<num.length;i++)
    	{
    	 if(num[i]==n)
    
            break;  
    	}
	if(i<num.length)
	{
		System.out.println("Elemrnt found at :"+i);
	}
	else
	{
          System.out.println("element not found");
	}
	}

}

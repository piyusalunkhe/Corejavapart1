package corejavapart1;

import java.util.Arrays;

public class StringBufffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//StringBuffer str=new StringBuffer("I like java");
		//System.out.println(str.capacity());
        //System.out.println(str.append("I love Programming"));
        //System.out.println(str.capacity());
        //System.out.println(str.length());
       // System.out.println(str.charAt(5));
        //System.out.println(str.delete(3,5));
       // System.out.println(str.deleteCharAt(0));
        //StringBuffer sb=new StringBuffer();  
        //System.out.println(sb.capacity());  
       //sb.append("DataFlair");  
        //System.out.println(sb.length());
        //System.out.println(sb.capacity());
        //sb.append("DataFlair is company that teaches programming!!!");  
        //System.out.println(sb.capacity()); 
        //sb.ensureCapacity(10);
        //System.out.System.out.println(emptyStr.trim());  
        //sb.ensureCapacity(50);
        //System.out.println(sb.capacity());
         String emptyStr="  Coking  ";
        // System.out.println(emptyStr.isEmpty());
         //System.out.println(emptyStr.isBlank());
         //System.out.println(emptyStr.startsWith("king"));
        // System.out.println(emptyStr.endsWith("king"));
         //System.out.println(emptyStr.trim());
         //System.out.println(emptyStr.strip());
         System.out.println(emptyStr.stripLeading());//remove white space from start
         System.out.println(emptyStr.stripTrailing());//remove white space from end
         String s="JAVA";
         char[]dest=new char[4];
         s.getChars(0, 4, dest, 0);
         System.out.println(Arrays.toString(dest));
         
	}

}

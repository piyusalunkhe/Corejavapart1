package corejavapart1;

public class StringBufferPolindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       StringBuffer sb=new StringBuffer("priyanka");
       System.out.println(sb.reverse());
       if(sb.reverse()==sb)
       {
    	   System.out.println("Polindrome String");
    	   break;
       }
       if(sb.reverse()!=sb)
       {
    	   System.out.println("not polindrom String");
       }
	}

}

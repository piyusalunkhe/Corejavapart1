package corejavapart1;

import java.util.Calendar;

public class StringBuilderOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       // StringBuilder sb=new StringBuilder("java");
        //System.out.println(sb.reverse());
       // System.out.println(sb.delete(3,5));
       // System.out.println(sb.append("programming"));
        //System.out.println(sb.insert(3,"dd"));
	
	System.gc();
    StringBuilder stringBuilder = new StringBuilder("Vikram");
    long startTime1 = Calendar.getInstance().getTimeInMillis();
    for (long i = 0; i < 10000000; i++) {
        stringBuilder.append(i);
    }
    long endTime1 = Calendar.getInstance().getTimeInMillis();
    System.out.println("Time taken for 10000000 appends for StringBuilder:" + (endTime1 - startTime1) + " ms");

    System.gc();
    StringBuffer stringBuffer = new StringBuffer("Vikram");
    long startTime2 = Calendar.getInstance().getTimeInMillis();
    for (long i = 0; i < 10000000; i++) {
        stringBuffer.append(i);
    }
    long endTime2 = Calendar.getInstance().getTimeInMillis();
    System.out.println("Time taken for 10000000 appends for StringBuffer:" + (endTime2 - startTime2) + " ms");

}

}

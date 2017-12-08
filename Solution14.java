
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution14 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();
        // my code start from here
//	        String[] snew = new String[s.length];
//	        ArrayList<BigDecimal> sArray = new ArrayList<>();
//	        for(int i=0;i<n;i++)
//	        {
//	            sArray.add(new BigDecimal(s[i]));
//	        }
//	        Collections.sort(sArray);
//	        for(int i=0;i<n;i++)
//	        {
//	            snew[i] = ""+sArray.get(i);
//	        }
//	        s = snew;
	    		class ForNew implements Comparable<ForNew>{
		    		int index;
		    		BigDecimal big;
		    		String bigInString;
		    		public ForNew(int index, BigDecimal big, String bigInString) {
		    			super();
		    			this.index = index;
		    			this.big = big;
		    			this.bigInString = bigInString;
		    		}
		    		@Override
		    		public int compareTo(ForNew o) {
		    			if(this.big.compareTo(((BigDecimal)o.big)) == 1) 
		    				return -1;
		    			if(this.big.compareTo(((BigDecimal)o.big)) == -1) 
		    				return 1;
		    			return 0;
		    		}
	    		} 
	    		String[] snew = new String[s.length];
	        ArrayList<ForNew> sArray = new ArrayList<>();
	        for(int i=0;i<n;i++)
	        {
	        		sArray.add(new ForNew(i,new BigDecimal(s[i]),s[i]));
	        }
	        Collections.sort(sArray);
	        for(int i=0;i<n;i++)
	        {
	            int index = sArray.get(i).index;
	            snew[i] = s[index];
	        }
	        s = snew;
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
	}
}

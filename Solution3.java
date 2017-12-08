import java.util.Scanner;

public class Solution3 {
	 public static void main(String args[] ) throws Exception {
	        /* Sample code to perform I/O:
	         * Use either of these methods for input
			*/
	        //BufferedReader
//	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//	        String name = br.readLine();                // Reading input from STDIN
//	        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

	        	
	        Scanner sc = new Scanner(System.in);
	        int t = sc.nextInt();
	        int[] result = new int[t];
	        sc.nextLine();
	        String[] ballons = new String[t];
	        for (int i=0; i<t; i++){
	            String ball = sc.nextLine();
	            ballons[i] = ball;
	        }
	        for(int j=0; j<t; j++){
	        		int count = 0;
	        		int add = 0;
	            String[] test = ballons[j].split("");
	            for (int k=0; k<test.length; k++) {
	            		if(isEqual(test[k])) {
	            			count++;
	            		}
	            }
	            if(count>test.length-count) {
	            		System.out.println(-1);
	            		break;
	            }else {
		            if(count< test.length-count)
		            add = fact((test.length)-count)*((fact((test.length)-count+1)/(fact(count)*fact(test.length-count))));
		            else {
		            		add= fact(test.length-count)*(fact(count));
		            }
		            result[j]=add;
		            }
	            }
	        
	        for(int k=0;k<t;k++) {
	        		System.out.println(result[k]);
	        }
	        // Write your code here

	    }
	 
	 public static Boolean isEqual(String test) {
		 String[] vowels  = {"a","e","i","o","u"};
		 for(int i=0; i<vowels.length ; i++) {
			 if(test.equals(vowels[i])) {
				 return true;
			 }
		 }
		 return false;
	 }
	 
	 public static int fact(int number){  
		  int i,fact=1;    
		  for(i=1;i<=number;i++){    
		      fact=fact*i;    
		  }    
		  return fact;
	 }  
}

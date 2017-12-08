import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;

public class Solution15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      Scanner in = new Scanner(System.in);
	      BigInteger n = in.nextBigInteger();	
	      in.close();
	      
	      if(n.isProbablePrime(200000)) 
	    	  	System.out.println("prime");
	      else 
	    	  	System.out.println("not prime");
        
	}

}

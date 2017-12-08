import java.util.Scanner;

public class Soluiton {

	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    int count = 0;
	    int i=0;
	    String s="";
	    double d=0;
	    if(scan.hasNextInt()){
	    		System.out.println("in int first");
	    		i = scan.nextInt();
	    		if(scan.hasNextDouble()) {
	    			System.out.println("in double then string");
	    			d = scan.nextDouble();
	    			scan.nextLine();
	    			s = scan.nextLine();
	    		}else {
	    			System.out.println("in second line then double");
	    			scan.nextLine();
	    			s = scan.nextLine();
	    			d = scan.nextDouble();
	    		}
	    }else {
	    	 if(scan.hasNextLine()) {
		    	s = scan.nextLine();
		    	if(scan.hasNextInt()) {
		    		i = scan.nextInt();
		    		d = scan.nextDouble();
		    	}else {
		    		d = scan.nextDouble();
		    		i = scan.nextInt();
		    	}	
		 }else {
			 d = scan.nextDouble();
			 if(scan.hasNextInt()) {
				i = scan.nextInt();
		    		scan.nextLine(); 
		    		s = scan.nextLine();
			 }else {
				 s = scan.nextLine();
				 i = scan.nextInt();
			 }
		 }
	    	 
	    }
	    

        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
        scan.close();
	}
}

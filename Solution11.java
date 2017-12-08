
import java.util.Scanner;

public class Solution11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		  String s = scan.nextLine();
		  s = s.trim();
	        // Write your code here.
//		  	ArrayList<String> toPrint = new ArrayList<>();
//		  	String[] FirstSplit = s.split(" ");
//		  	for(int i = 0 ; i<FirstSplit.length ; i++) {
//		  		String[] print = FirstSplit[i].split("[!,?._'@ ]");
//		  		for (int j =0; j<print.length ; j++) {
//		  			toPrint.add(print[j]);
//		  		}
//		  	}
//		  	for (int i = 0 ; i<toPrint.size(); i++) {
//		  		System.out.println(toPrint.get(i));
//		  	}
	        if(s.equals("")) {
	        		System.out.println(0);
	        }else {
	        		String[] toPrint = s.split("[ !,?._'@ ]+");
	        		System.out.println(toPrint.length);
		        for(int i = 0 ; i<toPrint.length ; i++){
		            System.out.println(toPrint[i]);
		        }
	        }
	    scan.close();
	}
}

import java.util.Scanner;

public class Soluiton2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[] printableString = new String[3];
		int[] printableInteger = new int[3];
		String[] printable = new String[3];
		int maxLengthString=0;
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            printableInteger[i] = x;
            printableString[i] = s1;
            //System.out.println("first for");
        }
        for(int k=0; k<2;k++) {
        		//System.out.println("second for start");
        		if(printableString[k].length()>printableString[k+1].length()) {
        			maxLengthString = printableString[k].length();
        		}else {
        			maxLengthString = printableString[k+1].length();
        		}	
        }
        for(int l=0; l<3; l++) {
        		int lengthint = (""+printableInteger[l]).length();
        		String printableint = ""+printableInteger[l];
        		for( int n=lengthint; n<3;n++) {
        			printableint = "0"+printableint;
        		}
        		int length = printableString[l].length();
        		for (int m=length;m<maxLengthString;m++) {
        			printableString[l] = printableString[l]+" ";
        		}
        		String toaddIn = "";
        		for (int o=printableString[l].length();o<15;o++) {
        			toaddIn = " "+toaddIn;
        		}
        		printable[l] = printableString[l]+toaddIn+printableint;
        		//System.out.println("Third for"+printable[l].length());
        }
        System.out.println("================================");
        for(int j = 0 ;j<3; j++){
            System.out.println(printable[j]);
            //System.out.println("forth for");
        }
        System.out.println("================================");
        sc.close();
	}
}

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution9 {
	public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        ArrayList<String> kSubString = new ArrayList<>();
        for (int i = 0 ; i<=s.length()-k; i++){
           String addnew = s.substring(i,i+k);
           kSubString.add(addnew);
        }
        System.out.println(kSubString);
        Collections.sort(kSubString);
        System.out.println(kSubString);
        smallest = kSubString.get(0);
        largest = kSubString.get(kSubString.size()-1);
        StringBuffer newbuffer = new StringBuffer(largest);
        newbuffer.reverse();
        System.out.println(newbuffer.toString());
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}

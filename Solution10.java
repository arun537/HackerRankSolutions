import java.util.ArrayList;
import java.util.Scanner;

public class Solution10 {

	static boolean isAnagram(String a, String b) {
        if(a.length() == b.length()){
        	String[] aExpand = a.trim().split("");
            String[] bExpand = b.trim().split("");
            ArrayList<String> bExpandList = new ArrayList<>();
            for (int k=0; k<bExpand.length; k++) {
            		bExpandList.add(bExpand[k]);
            }
            int count=0;
            for (int i = 0 ; i<aExpand.length; i++){
                for(int j =0 ; j<bExpandList.size() ; j++){
                		System.out.println("this is i:::"+i);
                    if(aExpand[i].equals(bExpandList.get(j)) || aExpand[i].toUpperCase().equals(bExpandList.get(j)) || aExpand[i].equals(bExpandList.get(j).toUpperCase())){
                    		System.out.println("in count this is J:::"+j+"This is b::;"+aExpand[i].toUpperCase());
                    		
                        count++;
                        bExpandList.remove(j);
                        j = bExpand.length;
                }
            }
        }
        System.out.println("This is count"+count);
        if(count == a.length()){
            return true;
        }else{
            return false;
        }
        }else{
            return false;
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	}

}

import java.util.ArrayList;
import java.util.Scanner;

public class Solution6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<String> toPrint = new ArrayList<>();
		while(sc.hasNext()) {
			String add = sc.nextLine();
			toPrint.add(add);
		}
		for (int i = 0 ; i<toPrint.size() ; i++) {
			System.out.println((i+1)+" "+toPrint.get(i));
		}
		sc.close();
	}

}

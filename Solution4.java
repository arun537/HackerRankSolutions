import java.util.ArrayList;
import java.util.Scanner;

public class Solution4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		ArrayList<int[]> finalTest = new ArrayList<>();
		for(int i = 0 ; i<t ; i++) {
			int size = sc.nextInt();
			int[] test = new int[size];
			sc.nextLine();
			for(int k = 0 ; k<size; k++) {
				test[k] = sc.nextInt();
			}
			finalTest.add(test);	
		}
		for(int j=0; j<t ; j++) {
			if(checkto(finalTest.get(j))) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
		sc.close();
	}
	
	public static Boolean checkto(int[] test) {
		int count = 0;
		int flag = 0;
		for(int i=0 ; i<test.length ; i++) {
			double number = Math.log(test[i])/Math.log(2);
			if(number == (int)number) {
				if(flag==0) {
					count++;
					flag = 1;
				}else {
					return true;
				}
			}else {
				flag = 0;
			}
		}
		return false;
	}
	
}

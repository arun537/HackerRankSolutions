import java.util.ArrayList;
import java.util.Scanner;

public class Solution18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		ArrayList<int[]> finalList = new ArrayList<>();
		ArrayList<int[]> queryList = new ArrayList<>();
		
		int n = in.nextInt();
		//System.out.println(n);
		in.nextLine();
		for (int i=0; i<n ; i++) {
			//System.out.println("in for loop");
			String line = in.nextLine();
			String[] lineSplit = line.split(" ");
			int length = Integer.parseInt(lineSplit[0]);
			int[] lineInt = new int[length];
			//System.out.println("this is length:::"+length);
			for (int j=0; j<length; j++) {
				//System.out.println("in inner for loop:::"+Integer.parseInt(lineSplit[j+1]));
				lineInt[j] = Integer.parseInt(lineSplit[j+1]);
			}
			finalList.add(lineInt);
		}
		//System.out.println("after first for");
		int q = in.nextInt();
		//in.nextLine();
		for(int i =0 ; i<q; i++) {
				//System.out.println("in second for loop");
				int[] lineInt = new int[2];
				for (int j=0; j<2; j++) {
					//System.out.println("in second inner for loop"+Integer.parseInt(lineSplit[j]));
					lineInt[j] = in.nextInt();
				}
				
				queryList.add(lineInt);
		}
		for (int[] list : queryList) {
			int toSearchIn =list[0]-1;
			int[] ListToSerchIn = finalList.get(toSearchIn);
			try {
				System.out.println(ListToSerchIn[list[1]-1]);
			}catch(Exception e) {
				System.out.println("ERROR!");
			}
		}
		in.close();
	}
}

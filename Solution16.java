import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        
        ArrayList<Integer> size = new ArrayList<>();
        System.out.println(arr[0].length-3+":::::::this is the length");
        for(int i=0; i <= arr[0].length-3; i++){
        	System.out.println("in int for loop i:::::"+i);
            for(int j=0; j <= arr[0].length-3; j++){
            	System.out.println("int int for loop j:::::"+j);
            		System.out.println("values::::"+arr[i][j]+" "+arr[i][j+1]+" "+arr[i][j+2]+" "+arr[i+1][j+1]+" "+arr[i+2][j]+" "+arr[i+2][j+1]+" "+arr[i+2][j+2]);
                int value = arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
                size.add(value);   
            }
        }
        System.out.println(size);
        Collections.sort(size);
        System.out.println(size.get(size.size()-1));
        in.close();
	}

}

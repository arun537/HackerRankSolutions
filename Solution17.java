import java.util.Scanner;

public class Solution17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0 ; i<n ; i++){
            arr[i] = in.nextInt();
        }
        int numberOfNegative = 0;
        for (int i = 0 ; i<n ; i++){
        		System.out.println("This is I:::"+i);
            int sum = 0;
            for (int j = i ; j<n ;j++){
            		System.out.println("This is J::::"+j);
            		System.out.println("this is sum before:::"+sum);
                sum = sum+arr[j];
                System.out.println("this is sum after:::"+sum);
                if(sum < 0){
                    numberOfNegative++;
                }
            }
        }
        System.out.println(numberOfNegative);
        in.close();
    }
}


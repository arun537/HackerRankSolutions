import java.util.Scanner;

public class Solution7 {

		static int B,H;
		static Boolean flag;
		static {
			Scanner sc = new Scanner(System.in);
			try {
				B = Integer.parseInt(sc.nextLine());
				if(B<0) {
					throw new Exception("Breadth and height must be positive");
				}
				H = Integer.parseInt(sc.nextLine());
				if(H<0) {
					throw new Exception("Breadth and height must be positive");
				}
				flag = true;
			}
			catch(Exception E) {
				System.out.println(E.getMessage());
			}finally {
				sc.close();
			}
			
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(flag) {
			int area = B*H;
			System.out.println(area);
		}
	}

}

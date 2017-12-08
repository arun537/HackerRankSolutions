import java.util.ArrayList;
import java.util.Scanner;

public class Soluiton5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t=in.nextInt();
		ArrayList<save> point = new ArrayList<>();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            point.add(new save(a, b, n));
        }
        for (int k=0; k<t ; k++) {
        	save temp = point.get(k);
        	int a = temp.a;
        	int b = temp.b;
        	int n = temp.n;
        	int powertwo = 1;
        		String print  = new String();
        		int previous = 0 ;
            for(int j=0; j<n; j++){
            		if(j>0){
            			powertwo = powertwo*2;
                 }else{
                	 	powertwo = 1;
                 }
                 print = print+(a+powertwo*b+previous)+" ";
                 previous = powertwo*b+previous;
             }
             System.out.println(print);
        }
        in.close();
	}
	static class save {
		public int a,b,n;
		public save(int a, int b, int n) {
			super();
			this.a = a;
			this.b = b;
			this.n = n;
		}
		
	}
}

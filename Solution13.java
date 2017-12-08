import java.util.Scanner;

public class Solution13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }
        in.close();
	}	
}

class MyRegex{
	 public String pattern;

	public MyRegex() {
		super();
		String pattern = "\\b((25[0–5]|2[0–4]\\d|[01]?\\d\\d?)(\\.)){3}(25[0–5]|2[0–4]\\d|[01]?\\d\\d?)\\b";
		this.pattern = pattern;
	}
	 
}
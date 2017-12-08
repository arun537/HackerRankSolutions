import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Solution19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		class Game{
			public int leap;
			public int[] gameArray;
			public Game(int leap, int[] gameArray) {
				super();
				this.leap = leap;
				this.gameArray = gameArray;
			}
			@Override
			public String toString() {
				return "Game [leap=" + leap + ", gameArray=" + Arrays.toString(gameArray) + "]";
			}
			
		}
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		System.out.println("this is n:::"+n);
		ArrayList<Game> list = new ArrayList<>();
		for (int i = 0 ; i < n ; i++) {
			System.out.println("in for loop");
			int lengthOfGame = in.nextInt();
			System.out.println("This is length of array::::"+lengthOfGame);
			int leap = in.nextInt();
			System.out.println("this is leap::::"+leap);
			int[] gameArray = new int[lengthOfGame];
			for(int j = 0 ; j < lengthOfGame ; j++) {
				System.out.println("in inner for loop");
				gameArray[j] = in.nextInt();
			}
			Game newGame = new Game(leap, gameArray);
			list.add(newGame);
		}
		System.out.println("This is the list::"+list);
		in.close();
		for (int i = 0 ; i<list.size() ; i++) {
			Game game = list.get(i);
			int leap = game.leap;
			int[] gameArray = game.gameArray;
			for(int j = 0 ; j<=gameArray.length; j++) {
				if(j < gameArray.length) {
					if(gameArray[j+1]==0) {
						j++;
					}else {
						if(gameArray[j+leap] == 0) {
							j = j+leap;
						}else {
							int indexToCheckAndGo = closestZero(j, gameArray);
							int indexToGo = j+leap-indexToCheckAndGo;
							if(j+leap<indexToCheckAndGo) {
								if(canGoToPreviousIndex(j,indexToGo, gameArray)) {
									j = indexToCheckAndGo;
								}
							}else {
								System.out.println("NO");
							}
						}
					}
				}else {
					System.out.println("YES");
				}
			}
		}
		
	}
	
	public static int closestZero(int currentIndex, int[] gameArray) {
		for(int i = currentIndex ; i< gameArray.length; i++) {
			if(gameArray[i] == 0) {
				return i;
			}
		}
		return 0;
	}
	public static boolean canGoToPreviousIndex(int currentIndex, int destinationIndex, int[] gameArray) {
		for(int i = currentIndex; i >= destinationIndex; i--) {
			if(gameArray[i] != 0) {
				return false;
			}
		}
		return true;
	}

}

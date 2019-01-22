package blackjack;

public class Blackjack {
public static int num1 = (int)(1 + (Math.random() * 25));
public static int num2 = (int)(1 + (Math.random() * 25));

	public static void main(String[] args) {
		Deal(num1,num2);
	}
	
	public static String Deal(int x , int y) {
		System.out.println("Player One " + x);
		System.out.println("Player Two " + y);
		if ((x == 21) || (y == 21)) {
			if (y != 21) {
				System.out.println("Player One Wins with Blackjack");
				return "Player One Wins with Blackjack";
			}
			else {
				System.out.println("Player Two Wins with Blackjack");
				return "Player Two Wins with Blackjack";
			}
		}
		else if ((x > 21) && (y > 21)) {
			System.out.println("Bust");
			return "Bust";
		}
		else if ((x > 21) && (y < 21)) {
			System.out.println("Player Two Wins");
			return "Player Two Wins";
		}
		else if ((x < 21) && (y > 21)) {
			System.out.println("Player One Wins");
			return "Player One Wins";
		}
		else if ((21 - x) < (21 - y)) {
			System.out.println("Player One Wins");
			return "Player One Wins";
		}
		else if ((21 - x) > (21 - y)) {
			System.out.println("Player Two Wins");
			return "Player Two Wins";
		}
		else if ((21 - x) == (21 - y)) {
			System.out.println("DRAW");
			return "DRAW";
		}
		return null;
	}
}

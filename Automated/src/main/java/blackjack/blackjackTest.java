package blackjack;

import static org.junit.Assert.*;

import org.junit.Test;

public class blackjackTest {

	@Test
	public void BlackjackTest1() {

		String result = Blackjack.Deal(21, 20);
		assertEquals("Player one did not win with Blackjack", "Player One Wins with Blackjack", result);

	}

	@Test
	public void BlackjackTest2() {

		String result = Blackjack.Deal(2, 21);
		assertEquals("Player Two did not win with Blackjack", "Player Two Wins with Blackjack", result);
	}

	@Test
	public void BlackjackTest3() {

		String result = Blackjack.Deal(20, 7);
		assertEquals("Player One did not win", "Player One Wins", result);
	}

	@Test
	public void BlackjackTest4() {

		String result = Blackjack.Deal(14, 19);
		assertEquals("Player Two did not win", "Player Two Wins", result);
	}

	@Test
	public void BlackjackTest5() {

		String result = Blackjack.Deal(20, 20);
		assertEquals("Players did not DRAW", "DRAW", result);
	}

	@Test
	public void BlackjackTest6() {

		String result = Blackjack.Deal(22, 22);
		assertEquals("Players did not Bust", "Bust", result);
	}

	@Test
	public void BlackjackTest7() {

		String result = Blackjack.Deal(7, 25);
		assertEquals("Player one did not win", "Player One Wins", result);
	}

	@Test
	public void BlackjackTest8() {

		String result = Blackjack.Deal(27, 2);
		assertEquals("Player Two did not win", "Player Two Wins", result);
	}

	@Test
	public void num1Test() {
		assertNotNull(Blackjack.num1);
	}

	@Test
	public void num2Test() {
		assertNotNull(Blackjack.num2);
	}
}

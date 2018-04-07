package com.kompeteer.core.domain;

import org.junit.Test;

public class TwoPlayerGameTest {
	@Test
	public void workerTest() {
		Player p1 = new Player();
		Player p2 = new Player();
		Player p3 = new Player();
		
		TwoPlayerGame g1 = new TwoPlayerGame();
		
		g1.setPlayers(p1, p2);
		g1.setWinner(p2);
	}
}


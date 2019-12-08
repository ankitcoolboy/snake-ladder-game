package snakeladdergame;

import static org.junit.jupiter.api.Assertions.assertThrows;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class gamewinnertesting {

	@Test
	void test() {
		player play=new player();
		assertThrows(GamewinnerException.class,() -> play.gamewinner(8));
	}

}

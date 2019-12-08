package snakeladdergame;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class trampolinetest {

	@Test
	void test() {
		player play=new player();
		
		assertThrows(TrampolinebiteException.class,() -> play.Trampoline(7));
	}

}
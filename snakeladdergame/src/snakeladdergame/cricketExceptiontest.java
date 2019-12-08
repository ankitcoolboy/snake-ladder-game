package snakeladdergame;

import static org.junit.Assert.*;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.Test;

public class cricketExceptiontest {

	@Test
	public void test() {
		player play=new player();
		assertThrows(CricketBiteException.class,() -> play.cricket(6));
	}

}

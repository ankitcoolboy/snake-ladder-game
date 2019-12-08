package snakeladdergame;

import static org.junit.Assert.*;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.Test;

public class vultureExceptiontest {

	@Test
	public void test() {
		player play=new player();
		assertThrows(VultureBiteException.class,() -> play.vulture(5));
	}

}

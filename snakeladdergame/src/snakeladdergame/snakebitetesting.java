package snakeladdergame;


import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;

public class snakebitetesting {

	@Test
	public void test() {
		player play=new player();
		assertThrows(SnakebiteException.class,() -> play.snake(4));
		
		
	}

}


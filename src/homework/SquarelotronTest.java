package homework;

import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.Test;

public class SquarelotronTest {
	Squarelotron squareRotate ;
	
	@Before
	public void setUp() throws Exception {
		squareRotate = new Squarelotron(4);
	}

	@Test
	public void testSquarelotron() {
		fail("Not yet implemented");
	}

	@Test
	public void testTotalRings() {
		assertEquals(squareRotate.totalRings(), 2);
		
	}

	@Test
	public void testUpsideDownFlip() {
		assertEquals(squareRotate.upsideDownFlip(1).squarelotron[0][0],13 );
		assertEquals(squareRotate.upsideDownFlip(2).squarelotron[1][1],10 );
	}

	@Test
	public void testMainDiagonalFlip() {
		assertEquals(squareRotate.mainDiagonalFlip(1).squarelotron[0][1],6 );
	}

	@Test
	public void testRotateRight() {
		fail("Not yet implemented");
	}

}

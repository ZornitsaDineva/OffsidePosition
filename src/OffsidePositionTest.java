import static org.junit.Assert.*;

import org.junit.Test;

public class OffsidePositionTest {

	@Test
	public void testOffsidePosition1() {
		OffsidePosition offsidePosition = new OffsidePosition();
		
		int[][] teams = {{5, 22, 30, 40, 30, 50, 30, 50, 50, 60, 50}, {96, 20, 30, 25, 25, 40, 60, 70, 80, 70, 40}};
		boolean result = offsidePosition.offsidePosition(teams);
		assertTrue(result);		
	}
	
	@Test
	public void testOffsidePosition2() {
		OffsidePosition offsidePosition = new OffsidePosition();	
		
		int[][] teams = new int[][]{{5, 22, 30, 40, 30, 50, 30, 50, 50, 60, 50}, {96, 28, 30, 25, 25, 40, 60, 70, 80, 70, 40}};
		boolean result = offsidePosition.offsidePosition(teams);
		assertFalse(result);
	}
	
	@Test
	public void testOffsidePosition3() {
		OffsidePosition offsidePosition = new OffsidePosition();	
		
		int[][] teams = new int[][]{{5, 20, 30, 40, 30, 50, 30, 50, 50, 60, 50}, {96, 20, 30, 25, 25, 40, 60, 70, 80, 70, 40}};
		boolean result = offsidePosition.offsidePosition(teams);
		assertFalse(result);		
	}

}

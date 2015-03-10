import static org.junit.Assert.*;

import org.junit.Test;


/**
 * Tests the FuelThruster class.
 *
 * @author Greg Wilkin.
 *         Created March 25, 2012.
 */
public class FuelThrusterTest {

	
	/**
	 * Test method for {@link FuelThruster#toString()}.
	 */
	@Test
	public void testToString1() {
		FuelThruster thruster1 = new FuelThruster("Saturn", 10);
		assertEquals("You have burned 0 fuel units of the 10 units allowed to the destination Saturn", thruster1.toString());
	}

	/**
	 * Test method for {@link FuelThruster#toString()}.
	 */
	@Test
	public void testToString2() {
		FuelThruster thruster1 = new FuelThruster("Jupiter", 15);
		thruster1.attemptToBurn(12);
		assertEquals("You have burned 12 fuel units of the 15 units allowed to the destination Jupiter", thruster1.toString());
	}

	/**
	 * Test method for {@link FuelThruster#toString()}.
	 */
	@Test
	public void testToString3() {
		FuelThruster thruster1 = new FuelThruster("Pluto", 100);
		thruster1.attemptToBurn(100);
		assertEquals("You have burned 100 fuel units of the 100 units allowed to the destination Pluto", thruster1.toString());
	}
	
	/**
	 * Test method for {@link FuelThruster#getLimit()}.
	 */
	@Test
	public void testGetLimit1() {
		FuelThruster thruster1 = new FuelThruster("PlanetX", 10);
		thruster1.attemptToBurn(3);
		thruster1.attemptToBurn(20);
		assertEquals(10, thruster1.getLimit());
	}

	/**
	 * Test method for {@link FuelThruster#getLimit()}.
	 */
	@Test
	public void testGetLimit2() {
		FuelThruster thruster1 = new FuelThruster("PlanetY", 17);
		thruster1.attemptToBurn(3);
		thruster1.attemptToBurn(20);
		assertEquals(17, thruster1.getLimit());
	}
	
	/**
	 * Test method for {@link FuelThruster#getTotalUnitsBurned()}.
	 */
	@Test
	public void testGetTotalUnitsBurnedInitially() {
		FuelThruster thruster1 = new FuelThruster("Neptune", 10);
		assertEquals(0, thruster1.getTotalUnitsBurned());
	}

	/**
	 * Test method for {@link FuelThruster#getTotalUnitsBurned()}.
	 */
	@Test
	public void testGetTotalUnitsBurnedAfterSuccessfulBurn() {
		FuelThruster thruster1 = new FuelThruster("Uranus", 10);
		thruster1.attemptToBurn(4);
		assertEquals(4, thruster1.getTotalUnitsBurned());
	}

	/**
	 * Test method for {@link FuelThruster#getTotalUnitsBurned()}.
	 */
	@Test
	public void testGetTotalUnitsBurnedAtLimit() {
		FuelThruster thruster1 = new FuelThruster("Mars", 15);
		thruster1.attemptToBurn(12);
		thruster1.attemptToBurn(3);
		assertEquals(15, thruster1.getTotalUnitsBurned());
	}
	
	/**
	 * Test method for {@link FuelThruster#getTotalUnitsBurned()}.
	 */
	@Test
	public void testGetTotalUnitsBurnedOverLimit() {
		FuelThruster thruster1 = new FuelThruster("Venus", 8);
		thruster1.attemptToBurn(6);
		thruster1.attemptToBurn(3);
		assertEquals(6, thruster1.getTotalUnitsBurned());
	}

	/**
	 * Test method for {@link FuelThruster#attemptToBurn(int)}.
	 */
	@Test
	public void testAttemptToBurn1() {
		FuelThruster thruster1 = new FuelThruster("Mercury", 10);
		assertTrue(thruster1.attemptToBurn(5));
		assertFalse(thruster1.attemptToBurn(6));
	}

	/**
	 * Test method for {@link FuelThruster#attemptToBurn(int)}.
	 */
	@Test
	public void testAttemptToBurn2() {
		FuelThruster thruster1 = new FuelThruster("Earth", 20);
		assertTrue(thruster1.attemptToBurn(15));
		assertTrue(thruster1.attemptToBurn(5));
		assertFalse(thruster1.attemptToBurn(1));
		assertFalse(thruster1.attemptToBurn(0));
		assertFalse(thruster1.attemptToBurn(-1));
	}

	/**
	 * Test method for {@link FuelThruster#attemptToBurn(int)}.
	 */
	@Test
	public void testAttemptToBurnInvalidNumberOfUnits() {
		FuelThruster thruster1 = new FuelThruster("Vegas", 10);
		assertFalse(thruster1.attemptToBurn(0));
		assertFalse(thruster1.attemptToBurn(-1));
	}




}

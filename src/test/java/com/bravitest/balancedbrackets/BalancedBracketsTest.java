/**
 * 
 */
package com.bravitest.balancedbrackets;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author Paulo
 *
 */
public class BalancedBracketsTest {

	private BalancedBrackets balancedBrackets;
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		
		balancedBrackets = new BalancedBrackets();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link com.bravitest.balancedbrackets.BalancedBrackets#isValidBrackets(java.lang.String)}.
	 */
	@Test
	public void testIsValidBracketsOne() {
		
		assertEquals(balancedBrackets.isValidBrackets("(){}[]"), true);
	}
	
	@Test
	public void testIsValidBracketsTwo() {
		
		assertEquals(balancedBrackets.isValidBrackets("[{()}](){}"), true);
	}
	
	@Test
	public void testIsValidBracketsThree() {
		
		assertEquals(balancedBrackets.isValidBrackets("[]{()"), false);
	}
	
	@Test
	public void testIsValidBracketsFour() {
		
		assertEquals(balancedBrackets.isValidBrackets("[{)]"), false);
	}

}

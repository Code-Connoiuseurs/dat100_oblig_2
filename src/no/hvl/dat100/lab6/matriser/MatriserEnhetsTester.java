package no.hvl.dat100.lab6.matriser;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Rule;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.rules.TestRule;
import org.junit.rules.Timeout;

class MatriserEnhetsTester {

	static int[][] a,b;
		
	@Rule
	public TestRule globalTimeout = Timeout.seconds(30);

	@BeforeEach
	public void initEach() {
		
		int[] a0 = {1,2,3};
		int[] a1 = {4,5,6};
		int[] a2 = {7,8,9};
		
		a = new int[3][];
		
		a[0] = a0;
		a[1] = a1;
		a[2] = a2;
		
		int[] b0 = {10,11,12};
		int[] b1 = {13,14,15};
		int[] b2 = {16,17,18};
		
		b = new int[3][];
		
		b[0] = b0;
		b[1] = b1;
		b[2] = b2;
		
	}
	
	@Test
	void testSkrivUt() {
		
		Matriser.skrivUt(a);
		Matriser.skrivUt(b);
	}
	
	@Test
	void testtilStreng() {
		
		assertEquals("1 2 3 \n4 5 6 \n7 8 9 \n",Matriser.tilStreng(a));
	}

	@Test
	void testSkaler() {
		
		int[][] skalert = { {2,4,6}, {8,10,12}, {14,16,18} };
		
		int[][] skaler = Matriser.skaler(2,a);
		
		assertFalse(skaler == a);
		assertArrayEquals(skalert,skaler);
	}
	
	@Test
	void testSpeile() {
		
		int[][] speilet = { {1,4,7}, {2,5,8}, {3,6,9} };
			
		int[][] speile = Matriser.speile(a);
		
		assertFalse(speile == a);
		assertArrayEquals(speilet,speile);
	}
	
	@Test 
	void testMultipliser () {

		int[][] c = { {84,90,96}, {201,216,231}, {318,342,366} };

		int[][] multiplisert = Matriser.multipliser(a,b);
		
		assertArrayEquals(c,multiplisert);
		
	}
	
	@Test
	void testerLik() {
		
		assertTrue(Matriser.erLik(a, a));
		
		assertFalse(Matriser.erLik(a, b));
	}
}

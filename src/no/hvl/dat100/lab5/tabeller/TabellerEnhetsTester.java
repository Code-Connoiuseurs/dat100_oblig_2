package no.hvl.dat100.lab5.tabeller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Rule;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.rules.TestRule;
import org.junit.rules.Timeout;

class TabellerEnhetsTester {

	@Rule
	public TestRule globalTimeout = Timeout.seconds(30);

	private static int[] tabell1, tabell2, tabell3;

	@BeforeEach
	public void initEach() {

		tabell1 = new int[3];
		tabell1[0] = 1;
		tabell1[1] = 4;
		tabell1[2] = 6;

		tabell2 = new int[1];
		tabell2[0] = 1;

		tabell3 = new int[0];

	}

	@Test
	void testSkrivUt() {

		Tabeller.skrivUt(tabell1);
		Tabeller.skrivUt(tabell2);
		Tabeller.skrivUt(tabell3);
	}

	@Test
	void testtilStreng() {

		assertEquals("[1,4,6]", Tabeller.tilStreng(tabell1));
		assertEquals("[1]", Tabeller.tilStreng(tabell2));
		assertEquals("[]", Tabeller.tilStreng(tabell3));
	}

	@Test
	void testSummer() {
		
		assertEquals(11, Tabeller.summer(tabell1));
		assertEquals(1, Tabeller.summer(tabell2));
		assertEquals(0, Tabeller.summer(tabell3));
		
	}

	@Test
	void testfinnesTall() {
		
		assertTrue(Tabeller.finnesTall(tabell1, 1));
		assertTrue(Tabeller.finnesTall(tabell1, 4));
		assertTrue(Tabeller.finnesTall(tabell1, 6));

		assertFalse(Tabeller.finnesTall(tabell1, 7));
		assertFalse(Tabeller.finnesTall(tabell3, 7));
		
	}

	@Test
	void testposisjonTall() {

		assertEquals(0, Tabeller.posisjonTall(tabell1, 1));
		assertEquals(1, Tabeller.posisjonTall(tabell1, 4));
		assertEquals(2, Tabeller.posisjonTall(tabell1, 6));

		assertEquals(-1, Tabeller.posisjonTall(tabell1, 7));
		assertEquals(-1, Tabeller.posisjonTall(tabell3, 7));

	}

	@Test
	void testreverser() {

		int[] tabell = { 6, 4, 1 };

		int[] reversert1 = Tabeller.reverser(tabell1);
		int[] reversert2 = Tabeller.reverser(tabell2);
		int[] reversert3 = Tabeller.reverser(tabell3);

		assertFalse(tabell1 == reversert1); // reverse must allocate new array
		assertArrayEquals(tabell, reversert1);
		
		assertFalse(tabell2 == reversert2);
		assertArrayEquals(tabell2, reversert2);
		
		assertFalse(tabell1 == reversert1);
		assertArrayEquals(tabell3, reversert3);
		
	}

	@Test
	void erSortert() {

		int[] tabell = { 6, 4, 1 };

		assertTrue(Tabeller.erSortert(tabell1));
		assertTrue(Tabeller.erSortert(tabell2));
		assertTrue(Tabeller.erSortert(tabell3));

		assertFalse(Tabeller.erSortert(tabell));
		
	}

	@Test
	void testsettSammen() {

		int[] tabell = { 1, 1, 4, 6 };

		assertArrayEquals(tabell, Tabeller.settSammen(tabell2, tabell1));
		assertArrayEquals(tabell1, Tabeller.settSammen(tabell3, tabell1));
		assertArrayEquals(tabell1, Tabeller.settSammen(tabell1, tabell3));
		
	}
}

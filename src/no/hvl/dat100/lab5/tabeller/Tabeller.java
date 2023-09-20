package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {
		for (int tall : tabell) {
			System.out.println(tall);
		}

	}

	// b)
	public static String tilStreng(int[] tabell) {
		String ut = "[";
		for (int i = 0; i < tabell.length; i++) {
			ut += tabell[i];
			if (i < tabell.length - 1) {
				ut += ",";
			}
		}
		ut += "]";
		return ut;

	}

	// c)
	public static int summer(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("Metoden summer ikke implementert");
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		boolean funnet = false;
		int i = 0;

		while (!funnet && i < tabell.length) {
			if (tabell[i] == tall) {
				funnet = true;
			}
			i++;

		}
		return funnet;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		// TODO
		throw new UnsupportedOperationException("Metoden posisjonTall ikke implementert");

	}

	// f)
	public static int[] reverser(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("Metoden reverser ikke implementert");

	}

	// g)
	public static boolean erSortert(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("Metoden erSortert ikke implementert");
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		// TODO
		throw new UnsupportedOperationException("Metoden settSammen ikke implementert");
	}
}

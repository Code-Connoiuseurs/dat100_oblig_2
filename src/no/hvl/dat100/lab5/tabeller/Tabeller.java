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
		int sum = 0;
		int j = 0;

//		for (int i = 0; i < tabell.length; i++) {
//			sum += tabell[i];
//		}

//		for (int i : tabell) {
//			sum += i;
//		}
		while (j < tabell.length) {
			sum += tabell[j];
			j++;
		}
		return sum;
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
		int pos = -1;

		for (int i = 0; i < tabell.length; i++) {
			if (tall == tabell[i]) {
				pos = i;
			}
		}
		return pos;

	}

	// f)
	public static int[] reverser(int[] tabell) {
		int[] nyTabell = new int[tabell.length];
		int sistePos = tabell.length - 1;
		int j = 0;

		for (int i = tabell.length; i > 0; i--) {
			nyTabell[j] = tabell[sistePos];
			sistePos--;
			j++;
		}
		return nyTabell;
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		boolean sortert = true;

		for (int i = 0; i < tabell.length - 1; i++) {
			if (tabell[i] > tabell[i + 1]) {
				sortert = false;
			}
		}
		return sortert;

	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		int[] nyTab = new int[tabell1.length + tabell2.length];
		
		for (int i = 0; i < tabell1.length; i++) {
			nyTab[i] = tabell1[i];
		}
		for (int i = 0; i < tabell2.length; i++) {
			nyTab[i + tabell1.length] = tabell2[i];
		}
		return nyTab;

	}
}

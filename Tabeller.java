package dat100_oblig_2.src.no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		System.out.print("[ ");
		for (int i = 0; i < tabell.length; i++) {
			System.out.print(tabell[i] + ", ");
		}
		System.out.println("]");

	}

	// b)
	public static String tilStreng(int[] tabell) {
		String streng = "[";
		for (int j = 0; j < tabell.length; j++) {
			if (j == tabell.length - 1) {
				streng += tabell[j];
			} else {
				streng += tabell[j] + ",";
			}
		}
		streng += "]";
		return streng;

	}

	// c)
	public static int summer(int[] tabell) {

		int forlengsum = 0;
		int whilesum = 0;
		int forsum = 0;

		// for (int k = 0; k < tabell.length; k++) {
		// sum = sum + tabell[k];

		/*
		 * int k = 0; while(k < tabell.length) { whilesum = whilesum + tabell[k]; k++;
		 */

		for (int n = 0; n < tabell.length; n++) { // skrev en ny for løkke isteden for den over til utvidet-for-løkke.
		}
		for (int n : tabell) {
			forlengsum = forlengsum + n; // veit at eg kan bruke +=.
		}
		return forlengsum;
		// return sum;
		// return whilesum;

	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		boolean finnes = false;
		int n = 0;

		while (!finnes && n < tabell.length) {
			if (tabell[n] == tall) {
				finnes = true;
			} else
				n++;
		}
		return finnes;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		int index = -1;

		for (int j = 0; j < tabell.length; j++) {
			if (tabell[j] == tall) {
				index = j;
			}
		}
		return index;

	}

	// f)
	public static int[] reverser(int[] tabell) {

		int[] nytabell = new int[tabell.length];

		for (int i = 0; i < tabell.length; i++) {

			nytabell[i] = tabell[tabell.length - 1 - i];

		}
		return nytabell;
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		boolean sort = true;

		for (int i = 0; i < tabell.length - 1; i++) {
			if (tabell[i] > tabell[i + 1]) {
				sort = false;
			}
		}
		return sort;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		int[] nytabell = new int[tabell1.length + tabell2.length];

		for (int i = 0; i < tabell1.length; i++) {
			nytabell[i] = tabell1[i];
		}
		for (int k = 0; k < tabell2.length; k++) {
			nytabell[tabell1.length + k] = tabell2[k];
		}

		return nytabell;
	}
}

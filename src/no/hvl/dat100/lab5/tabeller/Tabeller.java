package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {
		
		System.out.print("[");
		for (int i = 0; i<tabell.length; i++) {
			System.out.print(tabell[i]+ " ");
		}
		System.out.print("]");
	}
		

	// b)
	public static String tilStreng(int[] tabell) {
			
		String nyTab = "";
		
		for (int i = 0; i<tabell.length; i++) {
			if (i < tabell.length - 1) {
				nyTab += tabell[i] + ",";
			} else {
				nyTab += tabell[i];
			}
			System.out.print("[" + nyTab + "]");
		}
		return "[" + nyTab + "]";
	}

	// c)
	public static int summer(int[] tabell) {

		int forUtregning = 0;
		int whileUtregning = 0;
		int utvidetForUtregning = 0;
		
//		for (int i = 0; i<tabell.length; i++) {
//			forUtregning += tabell[i];
//		}
		
//		int i = 0;
//		while (i < tabell.length) {
//			whileUtregning += tabell[i];
//			i++;
//		}
		
		for (int i : tabell) {
			utvidetForUtregning += i;
		}
		
		return utvidetForUtregning;
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

	//f)
	public static int[] reverser(int[] tabell) {

		int[] nyTabell = new int[tabell.length];
		int start = 0;
		
		for (int i = tabell.length - 1; i >= 0; i--) {
			nyTabell[start] = tabell[i];
			start++;
		}
		return nyTabell;
	}

	// g) FEIL
	public static boolean erSortert(int[] tabell) {

		boolean sortert = true;
		
		for (int i = 0; i < tabell.length - 1; i++) {
			if ((tabell[i]) > tabell[i + 1]) {
				sortert = false;
			}
		}
		return sortert;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		int nyLengde = tabell1.length + tabell2.length;
		int[] nyTabell = new int[nyLengde];
		
		for (int i = 0; i < tabell1.length; i++) {
			nyTabell[i] = tabell1[i];
		}
		for (int j=0; j < tabell2.length; j++) {
			nyTabell[tabell1.length + j] = tabell2[j];
		}
		return nyTabell;
	}
}

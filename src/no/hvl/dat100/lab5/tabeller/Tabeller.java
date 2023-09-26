package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {
		System.out.print('[');
		
		for (int tall : tabell) {
			System.out.print(tall + ','); // Vi ittererer over tabellen og skriver ut hvert tall
		}
		
		System.out.print(']');
	}

	// b)
	public static String tilStreng(int[] tabell) {
		String tallStreng = "";
		
		for (int i = 0; i < tabell.length; i++) {
			if (i == tabell.length-1) {
				tallStreng += tabell[i];
				continue;
			}
			tallStreng += tabell[i] + ",";
		}
		
		return String.format("[%s]", tallStreng);
	}

	// c)
	public static int summer(int[] tabell) {
		int sum = 0;

		for (int i = 0; i < tabell.length; i++) {
			sum += tabell[i];
		}
		
//		int i = 0;
//		while (i < tabell.length) {
//			sum += tabell[i];
//			i++
//		}
			
//		for (int tall : tabell) {
//			sum += tall;
//		}
		
		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		boolean inneholderTall = false;
		
		for (int tabellTall : tabell) {
			if (tabellTall == tall) {
				inneholderTall = true;
				break;
			}
		}
		return inneholderTall;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		int tallPosisjon = -1;
		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) {
				tallPosisjon = i;
				break;
			}
		}
		return tallPosisjon;
	}

	// f)
	public static int[] reverser(int[] tabell) {
		int[] reversertTabell = new int[tabell.length];
		int h = 0;
		for (int i = tabell.length-1; i >= 0; i--) {
			reversertTabell[h] = tabell[i];
			h++;
		}
		return reversertTabell;
	}

	// g)
	public static boolean erSortert(int[] tabell) {
		int[] sortertTabell = sorter(tabell);
		boolean erSortert = true;
		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] != sortertTabell[i]) {
				erSortert = false;
				break;
			}
		}
		return erSortert;
	}
	public static int[] sorter(int[] tabell) {
		int[] kopiTabell = kopierTabell(tabell);

		// Implementering av bubble sort algoritmen
		boolean endringForrige = true;
		while (endringForrige) {
			endringForrige = false;
			for (int i = 0; i < kopiTabell.length-1; i++) {
				if (kopiTabell[i] > kopiTabell[i+1]) {
					endringForrige = true;
					kopiTabell = byttPlasser(kopiTabell, i, i+1);
				}
			}
		}
		return kopiTabell;
	}
	public static int[] byttPlasser(int[] tabell, int i1, int i2) {
		// Metode for å bytte verdiene mellom to indekser i en array
		int[] kopiTabell = kopierTabell(tabell);

		kopiTabell[i1] = tabell[i2];
		kopiTabell[i2] = tabell[i1];
		return kopiTabell;
	}
	public static int[] kopierTabell(int[] tabell) {
		// Metode for å generere en ny arrayreferanse i minne med samme verdier som en array
		int[] kopiTabell = new int[tabell.length];
		for (int i = 0; i < tabell.length; i++) {
			kopiTabell[i] = tabell[i];
		}
		return kopiTabell;
	}
	
	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		int[] tabell3 = new int[tabell1.length + tabell2.length];
		int h = 0;
		for (int i = 0; i < tabell1.length; i++) {
			tabell3[h] = tabell1[i];
			h++;
		}
		for (int i = 0; i < tabell2.length; i++) {
			tabell3[h] = tabell2[i];
			h++;
		}
		return tabell3;
	}
}

package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		
		for (int[] rad : matrise) {
			for (int kolonne : rad) {
				System.out.print(kolonne);
			}
			System.out.println();
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		String streng = "";
		
		for (int[] rad : matrise) {
			for (int kolonne : rad) {
				streng += kolonne + " ";
			}
			streng += "\n";
		}
		return streng;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		int[][] kopimatrise = new int[matrise.length][matrise[0].length];
		
		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				kopimatrise[i][j] = matrise[i][j] * 2;
			}
		}
		return kopimatrise;	
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] != b[i][j]) return false;
			}
		}
		return true;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {
//		Dette antar at dimensjonene er like store
		int[][] speiletMatrise = new int[matrise.length][matrise[0].length];
		for(int i = 0; i < matrise.length; i++) {
			for(int j = 0; j < matrise[i].length; j++) {
				speiletMatrise[i][j] = matrise[j][i];
			}
		}
		return speiletMatrise;
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {
		int[][] multiMatrise = new int[a.length][a[0].length];
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a.length; j++) {
				multiMatrise[i][j] = 0;
				for(int k = 0; k < a.length; k++) {
					multiMatrise[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		skrivUt(multiMatrise);
		return multiMatrise;
	}
}

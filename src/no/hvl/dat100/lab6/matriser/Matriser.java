package no.hvl.dat100.lab6.matriser;

public class Matriser {
	
	// a)
	public static void skrivUt(int[][] matrise) {
		
		for (int[] rad : matrise) {
			
			for (int v : rad) {
				System.out.print(v + " ");
			}
			System.out.println();
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		
		String stringTabell = "";
		
		for (int[] rad : matrise) {
			
			for (int i : rad) {
				stringTabell += i + " ";
			}
				stringTabell += "\n";
		}
		System.out.println(stringTabell);
		return stringTabell;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		int[][] nyMatrise = new int[matrise.length][matrise.length];
		 
		for (int r = 0; r<matrise.length; r++) {
			
			int[] rad = matrise[r];
			
			for (int v = 0; v<matrise.length; v++) {
				nyMatrise[r][v] = rad[v] * tall;
			}
		}
		return nyMatrise;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {   //Trenger kun å "skrive ut" en av matrisene (enten a eller b)

		boolean ersamme = true;

		for (int r = 0; r<a.length; r++) {
			
			for (int i = 0; i<r; i++) {
				
				if (a[r][i] != b[r][i]) {
					ersamme = false;
				}
			}
		}
		return ersamme;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO
		throw new UnsupportedOperationException("Metoden speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("Metoden multipliser ikke implementert");
	
	}
}

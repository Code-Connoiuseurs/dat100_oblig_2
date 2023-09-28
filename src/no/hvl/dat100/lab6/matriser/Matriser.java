package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {

		for (int[] rad : matrise) {

			for (int elem : rad) {
				System.out.print(elem + "\t");
			}

			System.out.println();
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {

		String ut = "";

		for (int[] rad : matrise) {

			for (int elem : rad) {
				ut += elem + " ";
			}
			ut += "\n";
		}
		return ut;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {

		int[][] matriseSkalert = new int[matrise.length][matrise.length];

		for (int rad = 0; rad < matrise.length; rad++) {

			int[] row = matrise[rad];

			for (int elem = 0; elem < row.length; elem++) {
				matriseSkalert[rad][elem] = row[elem] * tall;
			}
		}
		return matriseSkalert;

	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		boolean like = true;

		// Trenger kun å forholde oss til lengden av en av tabellene; hvis de ikke er
		// like lange er de heller ikke like
		for (int rad = 0; rad < a.length; rad++) {

			for (int elem = 0; elem < a.length; elem++) {

				if (a[rad][elem] != b[rad][elem]) {
					like = false;
					break;
				}
			}
		}
		return like;
	}

	// e)
	public static int[][] speile(int[][] matrise) {

		int[][] matriseKopi = new int[matrise.length][matrise.length];

		for (int rad = 0; rad < matrise.length; rad++) {

			for (int elem = 0; elem < matrise[rad].length; elem++) {
				matriseKopi[rad][elem] = matrise[elem][rad];
			}
		}
		return matriseKopi;
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		int[][] mltMatrise = new int[a.length][a.length];

		for (int rad = 0; rad < a.length; rad++) {

			for (int elemA = 0; elemA < b[0].length; elemA++) {

				for (int elemB = 0; elemB < a.length; elemB++) {
					mltMatrise[rad][elemA] += a[rad][elemB] * b[elemB][elemA];
				}

			}
		}
		return mltMatrise;
	}
}

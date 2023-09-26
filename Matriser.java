package dat100_oblig_2.src.no.hvl.dat100.lab6.matriser;

public class Matriser {
	public static void main(String[] args) {
		
	}
	// a)
	public static void skrivUt(int[][] matrise) {

		for(int i = 0; i < matrise.length; i++) {
			for(int j = 0; j < matrise.length; j++) {
				System.out.println(matrise[i][j]);
				
			//	if(j < matrise[i].length -1);
			//	System.out.println(", ");		// skriv ut med comma osv. 
			}
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		String streng = "";
		for(int i = 0; i < matrise.length; i++) {
			for(int j = 0; j < matrise.length; j++) {
				streng += matrise[i][j] + " ";
			}
			streng += "\n";
		}
		return streng;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		 int[][] nymatrise = new int[matrise.length][matrise[0].length];
		for(int i = 0; i < matrise.length; i++) {
			for(int j = 0; j < matrise[i].length; j++) {
				nymatrise[i][j] = matrise[i][j] * 2;
			}
		}
		return nymatrise;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j <b.length; j++) {
				if(a == b) {
					return true;
				}
			}
		}
		return false;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {
		int[][] speilet = new int[matrise.length][matrise[0].length];
		for(int i = 0; i < matrise.length; i++) {
			for(int j = 0; j < matrise[i].length; j++) {
				speilet[j][i] = matrise[i][j];
			}
		}
		return speilet;
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {
		int[][] multiplisert = new int[a.length][b[0].length];
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < b.length; j++) {
				
				int temp = 0;
			for(int k = 0; k < a.length; k++) {
				temp += a[i][k] * b[k][j];
				}
				multiplisert[i][j] = temp;
			}
		}
		return multiplisert;
	}	
}

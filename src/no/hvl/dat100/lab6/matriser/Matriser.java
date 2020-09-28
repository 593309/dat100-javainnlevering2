package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
	     for (int rad = 0; rad<5; rad++) {
	            System.out.print("[ ");
	            for (int kol = 0; kol<10; kol++) {
	                int a = matrise[rad][kol];
	            System.out.print(a + ", ");

	        }

	        System.out.println("] ");
	     }
	    }
	// b)
	public static String tilStreng(int[][] matrise) {
		 String verdi="";
	        for (int rad = 0; rad<3; rad++) {
	            verdi += "{";
	        for (int kol = 0; kol < 3; kol++) {

	            verdi += matrise[rad][kol];
	            if (kol < matrise.length-1) verdi += ", ";
	        }
	        verdi += "} ";

	    }
	        return verdi;
		
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		 int[][] verdi = matrise;

	        for (int rad = 0; rad<matrise.length; rad++) {
	            int a = matrise[rad].length;
	            for (int kol = 0; kol<a; kol++) {
	                verdi[rad][kol] = matrise[rad][kol]*tall;
	            }
	        }
	        return verdi;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		   boolean verdi = true;

	        for (int rad = 0; rad<a.length; rad++) {
	            int c = a[rad].length;
	            for (int kol = 0; kol<c; kol++) {
	                if (a[rad][kol] != b[rad][kol]) {
	                    verdi = false;
	                }
	            }

	    }
	        return verdi; 

	    }

	// e)
	public static int[][] speile(int[][] matrise) {

		int rader = matrise.length;
        int [][] a = new int[rader][rader];
        for (int rad = 0; rad < rader; rad++) {
            int c = rader-1;
            for (int kol = 0; kol<rader; kol++) {

                a[rad][kol] = matrise[rad][c];
                c--;
            }
        }
        return a;
    }
	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		 int[][] c = a;
	        for (int rad = 0; rad <a.length; rad++) {
	            for (int kol = 0; kol < a[rad].length; kol++) {
	                c[rad][kol] = a[rad][kol]*b[rad][kol];
	            }
	        }
	        return c;
	    }
	

}

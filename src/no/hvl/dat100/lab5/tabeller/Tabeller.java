package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
		private static void skrivUt (int[] tabell) {
			System.out.print("[");
			int l = 0;
			for (int tall : tabell) {
				l++;
				if (l != tabell.length)
				System.out.print(tall + ", ");
				else if (l == tabell.length)
				System.out.print(tall);

			}
			System.out.println("]");
		}


	// b)
		  public static String tilStreng(int[] tabell) {
		        String verdi = "[";
		        for (int g = 0; g < tabell.length; g++) {

		            verdi = verdi + tabell[g];
		            if (g < tabell.length-1) verdi += ", ";
		        }	
		        verdi += "]";
		        return verdi;
		    }
		

	// c)
		public static int summer (int[] tabell) {
	        int sum = 0;
	        for (int tall : tabell) {
	            sum = sum+tall;
	        }
	        return sum;
	    }

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		boolean funnet = false;
	        int i =0;
	        while (!funnet && i<tabell.length) {
	            if (tabell[i] == tall)
	                funnet = true;
	            else
	            i++;
	        }
	    return funnet; 
	    }


	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		  boolean funnet = false;
	        int i =0;
	        while (!funnet && i<tabell.length) {
	            if (tabell[i] == tall)
	                funnet = true;
	            else
	            i++;
	        }
	        if (funnet)
	            return i;
	        else if (!funnet)
	            i = -1;

	        return i;
	    }

	// f)
	public static int[] reverser(int[] tabell) {

	     int[] A = { 0, 0, 0, 0, 0, 0};
	        int x = 0;
	        for (int tall = tabell.length-1; tall > -1;) {
	            A[x]= tabell[tall];
	            x++;
	            tall--;
	        }

	        return A;

	    }

	// g)
	public static boolean erSortert(int[] tabell) {
		 boolean asd = true;
	        int x = 0;
	        int y = x;
	        for (int tall : tabell) { 
	            x = tall; 
	            if (x < -1)
	                y = x-1;

	            if (Math.max(x, y) == y) { 
	                asd = false;
	                return asd;
	            }
	            y = Math.max(x, y); 
	        }
	        return asd;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		 int y = tabell1.length+tabell2.length; 
	        int[] x = new int [y];
	        for (int i = 0; i< tabell1.length;i++) {
	            x[i] = tabell1[i];
	        }
	       
	        for(int j = 0; j < tabell2.length; j++) {
	            x[tabell1.length+j] = tabell2[j];
	        }

	        return x;
	    }
}

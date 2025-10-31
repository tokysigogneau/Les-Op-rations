
public class triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("         *        ");
		System.out.println("        ***        ");
		System.out.println("       *****      ");
		System.out.println("      *******       ");
		System.out.println("     *********     ");
		System.out.println("    ***********       ");
		
		//String Stars= "*";
	    //System.out.println(String.format("%12s", Stars));
	    //System.out.println(String.format("%10s", Stars));
	    

	    
		int position = 10;
		int nbOfStars = 1;
		
		// print() continue on the same line
		for (int i = 0; i < 6; i++) {

		    for (int n = 0; n < position; n++) {
		        System.out.print(" ");
		    }

		    for (int n = 0; n < nbOfStars; n++) {
		        System.out.print("*");
		    }
		    //then we use empty println() to move to next line
		    System.out.println();
		    
		    //i update the position and the number of stars for the next line
		    position -= 1;
		    nbOfStars += 2;
		}
	    
	}

}

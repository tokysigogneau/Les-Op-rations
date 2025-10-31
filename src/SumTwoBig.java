
public class SumTwoBig {

	public static void main(String[] args) { 
		int table[] = { -5, 2, -8, 31, 15, 4 };
	
	displayTab(table); 
	fonction(table); 
	//displayTab (table);
	}
	static void fonction(int[] tab) {
		int tmp = 0;
		
		for (int i = 0; i < tab.length; i++) { 
			for (int j = 1; j < (tab.length-i); j++){
					if (tab[j-1] > tab[j]) {
						tmp = tab[j - 1];
						tab[j - 1] = tab[j]; 
						tab[j] = tmp;

						}
					}
		}
		
		//This is the only edit i put, just the sum of the 2 last numbers
		System.out.println("Voici les deux plus grands nombres : " +tab[tab.length-1]+ " et " +tab[tab.length-2]);
		int SumTwoBigNumbers = tab[tab.length-1] + tab[tab.length-2];
		System.out.println("le total des deux nombres est : " + SumTwoBigNumbers);
	}
	static void displayTab(int[] tab) {
		for (int i = 0; i < tab.length; i++) { 
			System.out.print(tab[i] + " ");
		}
			System.out.println();
			}
		}

package sequencee;

public class TriPasInsertion {
	public static void main(String[] args) {
		
		int[] tableau = {1,0,2,3,5,4,9,8};
		triInsertion(tableau);
		
	}
	
	public static void triInsertion(int[] tableau) {
		for(int i = 1;i<tableau.length;i++) {
			int index = tableau[i];
			int j = i-1;
			while(j>= 0 && tableau[j]>index) {
				tableau[j+1]= tableau[j];
				j--;
			}
			tableau[j+1]= index;
		}
		for(int i = 0;i<tableau.length;i++) {
			System.out.print(tableau[i]);
		}
	}

}

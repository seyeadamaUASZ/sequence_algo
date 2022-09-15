package sequencee;

public class AlgoTri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {1,4,3,6,9,8};
		triTableau(array);

	}
	
	public static void triTableau(int[] tableau) {
		int tampon = 0;
		for(int i = 0;i<tableau.length;i++) {
			for(int j = 0;j<i;j++) {
				if(tableau[j]>tableau[j+1]) {
					tampon = tableau[j];
					tableau[j]= tableau[j+1];
					tableau[j+1] = tampon;
				}
			}
		}
		for(int i = 0;i<tableau.length;i++) {
			System.out.print(tableau[i]);
		}
		
	}

}

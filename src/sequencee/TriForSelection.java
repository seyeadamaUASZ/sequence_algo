package sequencee;

public class TriForSelection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] tableau = {1,0,2,3,5,4,9,8};
		triSelection(tableau);

	}
	
	public static void triSelection(int[] tableau) {
		for(int i = 0;i<tableau.length-1;i++) {
			int index = i;
			for(int j=i+1;j<tableau.length;j++) {
				if(tableau[j]<tableau[index]) {
					index = j;
				}
			}
			int min = tableau[index];
			tableau[index]= tableau[i];
			tableau[i]=min;
		}
		
		for(int i = 0;i<tableau.length;i++) {
			System.out.print(tableau[i]);
		}
		
	}

}

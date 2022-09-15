package sequencee;



/**
 * 
 * @author AdamaSEYE
 * la recheche dichotomique permet de faire une recherche
 * binaire depuis le mileu du tableau et dérouler progressivement
 * dans les sens du tableau
 */
public class DichotomieSearch {
	public static void main(String[] args) {
		
		int tableau[]= {1,2,3,4,5};
		
		 System.out.println(searchBinary(tableau, 7));
		
	}
	
	public static boolean searchBinary(int[] tab,int x) {
		int el = tab.length - 1;
		int dep = 0;
		while(dep<=el) {
			int mid = (dep+el)/2;
			if(tab[mid]==x) {
				return true;
				
			}
			if(tab[mid]<x) {
				dep = mid +1;
			}else {
				el = mid -1;
			}
			
		}
		return false;
		
		
	}

}

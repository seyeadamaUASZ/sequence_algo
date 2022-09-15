package sequencee;

public class Verification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]array= {5,1,22,25,6,-1,8,10};
		int[] sequence = {6,1,-1,10};
		
		System.out.println(veriftableau(array, sequence));

	}
	
	
	public static boolean veriftableau(int[] tab1,int[] tab2) {
		boolean verif = false;
		int index=0;
		for(int i=0;i<tab1.length;i++) {
			int element = tab1[i];
			if(tab2[index]==element) {
				index++;
			}
		}
		if(index==tab2.length) {
			return true;
		}else {
			return false;
		}
		

}
	
	
	public static boolean verif(int[] tab,int[] sequence) {
		int counter = 0;
		for(int i = 0;i< tab.length;i++) {
			int element = tab[i];
			if(element == sequence[counter]) {
				counter ++;
			}
		}
		if(counter==sequence.length) {
			return true;
		}else {
			return false;
		}
	}
}

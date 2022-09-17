package sequencee;

/**
 * 
 * @author AdamaSEYE
 * Vérifier le nombre de parenthese gauche et droite
 * parenthese ouvrante doit correspondre au parenthese fermante
 *
 */
public class VerifParenthese {
	
	public static void main(String[] args) {
		String parenthese = "(((dhelle)))";
		System.out.println(verifparenthese(parenthese));
	}
	
	public static boolean verifparenthese(String element) {
		char[] el = element.toCharArray();
		char parentheseGauche='(';
		char parentheseDroite =')';
		int counter = 0;
		
		for(int i = 0; i< el.length;i++) {
			if(el[i]==parentheseGauche) {
				counter++;
			}
			if(el[i]==parentheseDroite) {
				counter--;
			}
			
		}
		if(counter==0) {
			return true;
		}else {
			return false;
		}
	}

}

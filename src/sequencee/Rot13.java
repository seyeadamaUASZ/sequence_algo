package sequencee;

/**
 * 
 * @author AdamaSEYE
 * Modifier un message par rot13
 * chaque caractère sera modifié soit déplacé de +13 ou de -13
 *
 */
public class Rot13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String message = "Helloadamaseye";
		for(int i=0;i<message.length();i++) {
			char c = message.charAt(i);
			int n = c;
			if(n <65 || n>90) {
				
			}else if(n<78){
				c+=13;
			}else {
				c-=13;
			}
			System.out.print(c);
		}
		System.out.println();

	}

}

package sequencee;

public class Palindrome {
	public static void main(String[] args) {
		String mot = "radar";
		System.out.println("verification "+mot+ " : "+verifPalindrome(mot));
		
	}
	
	public static boolean verifPalindrome(String mot) {
	   
		//convertir en tableau de char
		char[] elements = mot.toCharArray();
		String result="";
		for(int i=elements.length-1;i>=0; i--) {
			result +=elements[i];
		}
		if(mot.equals(result)) {
			return true;
		}else {
			return false;
		}
	}

}

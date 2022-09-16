package sequencee;

public class ParseToRoman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 9;
        System.out.println(" la correspondance est "+parseToRoman(1000));
	}
	
	//parse number to roman number 
	
	public static String parseToRoman(int nombre) {
		int[] tableauChiffre = {1000,500,100,50,10,5,1};   
		char[] chiffreRomain = {'M','D','C','L','X','V','I'};
		
		String result ="";
		//on essaie de faire une correspondance
		
		//si le nombre divisible par 1000 -> M
		 // le restant on le vérifie par 500 
		// si c'est divisible -> D ainsi de suite
		// n % 1000 < n -> unité 1000 non utilisé
		// n% 5 < n -> oui utilise l'unité
		
		for(int i=0;i<tableauChiffre.length;i++) {						
			while(nombre%tableauChiffre[i]<nombre) {
				result += chiffreRomain[i];
				nombre -= tableauChiffre[i];
				//correspondance sur certains
				
				if(result.contains("VIIII")) {
					result=result.replaceAll("VIIII","IX");
					
				}
				if(result.contains("IIII") && !result.contains("V")) {
					result=result.replaceAll("IIII","IV");
				}
			}
			
		}
		if(result.equals("IIII")) {
			result="IV";
		}
		if(result.equals("VIIII")) {
			result="IX";
		}
		//convert to string
		return result;
	}

}

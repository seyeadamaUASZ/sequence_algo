package sequencee;

public class JourExactDuneDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      jourExactDate("29/09/2022");
	}
	
	public static void jourExactDate(String date) {
		String[] dateformat = date.split("/");
		String jour = dateformat[0];
		String mois = dateformat[1];
		String annee = dateformat[2];
		
		int day = Integer.parseInt(jour);
		int month = Integer.parseInt(mois);
		int year = Integer.parseInt(annee);
		
	   
		//formule expliqué sur  l'image jointe
		//formule appliquee (J+(A-1900)+[A-1900/4]+_M[M])%7
		int[] matchDecalageDay = {0,3,3,6,1,4,6,2,5,0,3,5};
	    //matching
		String[] days= {"Lundi","Mardi","Mercredi","Jeudi","Vendredi","Samedi","Dimanche"};
		int match = matchDecalageDay[month-1];
		
		//System.out.println(match);
		
		int result = (day + (year-1900)+((year-1900)/4)+match)%7;
		
		//System.out.println("result is "+result);
		
		String dayExact = days[result-1];
		
		System.out.println("correspondance exact au jour est "+dayExact);
		
	}

}

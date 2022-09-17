package sequencee;
/**
 * 
 * @author AdamaSEYE
 * Trouver le plus grand diviseur commun entre deux nombres
 *
 */
public class PGCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n1=90;
        int n2 = 36;
        pgcd(n1, n2);
	}
	
	public static void pgcd(int a,int b) {
		int d =0;
		while (a!=b) {
			d = Math.abs(b-a);
			b=a;
			a=d;
			System.out.println("le pgcd est : "+d);
		}
		if(d==1) {
			System.out.println("les deux nombres sont premiers");
		}
		if(a==b) {
			System.out.println("le pgcd final est :"+a);
		}
		
		
	}

}

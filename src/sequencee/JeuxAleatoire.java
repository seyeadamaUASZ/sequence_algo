package sequencee;


import java.util.Scanner;

/**
 * 
 * @author AdamaSEYE
 * astuce de ce jeux est de trouver le nombre aleatoire caché par l'ordinateur
 * de peaufiner l'objectif de base est de voir si le nombre entré est inférieur
 * ou supérieur au nombre caché avec un nombre d'essai permis après cela il sera
 * si trouvé avant essais terminé Bravo sinon Perdu
 *
 */
public class JeuxAleatoire {
	public final static int MAX=100;
	public final static int MIN = 1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int essais = 5;
		int nombreCache= MIN + (int)(Math.random() * ((MAX - MIN) + 1));
		System.out.println(" nombre caché "+nombreCache);
		do {
			System.out.println("Enter votre nombre");
			int n = sc.nextInt();
			//sc.close(); 
			if(n<nombreCache) {
				System.out.println("le nombre donné est plus petit que le nombre caché");
			}
			if(n>nombreCache) {
				System.out.println("le nombre donné est plus grand que le nombre caché");
			}
			if(n==nombreCache) {
				System.out.println("Bravo !! Vous avez gagné en "+ essais + " restants");
				break;
			}
			essais--;
		}while(essais>0);
		
		if(essais ==0) {
			System.out.println(" C'est fini le jeux,vous avez perdu !! ");
		}

	}
	
	

}

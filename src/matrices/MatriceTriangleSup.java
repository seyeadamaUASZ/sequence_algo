package matrices;

import java.util.Scanner;


/*
 * Une matrice triangulaire supérieure est une matrice carrée spéciale dont tous les éléments 
 * en dessous de la diagonale principale sont nuls, 
 * ce qui signifie que 
 *  a(i,j) = 0 quelque soit i>=j
 */
public class MatriceTriangleSup {
	
	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		 
        int A[][];
        int M = 2, N = 2, i, j;
 
        // intialiser la taille de A
        A = new int[M][N];
 
        // Saisir les éléments de la matrice A
        for (i = 0; i < M; i++) {
            for (j = 0; j < N; j++) {
                System.out.print("A[" + i + "][" + j + "] : ");
                A[i][j] = clavier.nextInt();
            }
 
        }
		
      System.out.println(isTriangle(A));  
	}
	
	public static boolean isTriangle(int[][] tableau) {
		boolean isTriangle = true;
		for(int i = 0;i<tableau.length;i++) {
			for(int j=0;j<i;j++) {
				if(tableau[i][j]!=0) {
					isTriangle = false;
					break;
				}
			}
		}
		return isTriangle;
	}

}

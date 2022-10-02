package coding_interview;

/**
 * dans ce type d'algorithme, on essaie de
 * retrouver l'element unique d'un tableau en le retournant
 * ex: [1,2,2,1,4]
 * [4]
 * Dans cette approche, nous avons une autre
 * methode appelée dans la seconde pour seulement
 * compter la recurrence
 */
public class SingleNumber {
    public static void main(String[] args) {
        int[] tableau = { 1, 2, 2, 1 };
        single(tableau);
    }

    // avoir le nombre element d'un tableau

    public static int numberElementArray(int[] tab, int x) {
        int nombre = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == x) {
                nombre++;
            }
        }
        return nombre;
    }

    public static void single(int[] tab) {
        int result = 0;
        int element = 0;
        for (int i = 0; i < tab.length; i++) {
            result = numberElementArray(tab, tab[i]);
            if (result == 1) {
                element = tab[i];
                break;
            }
        }
        System.out.println(element == 0 ? "No single element " : "[" + element + "]");

    }
}

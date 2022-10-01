package sequencee;

import java.util.ArrayList;
import java.util.List;

/**
 * On essaie de trouver la plage où nous avons le plus
 * de nombre de grand nombres
 * et donner les index de la plage
 * a chaque fois on recupere un max en ayant son index
 * tous les index seront sur un tableau donne
 */

public class MaxMonth {

    public static void main(String[] args) {

        int[] tableau = { 1, 4, 5, 8, 18, 20, 3, 1 };
        plageMax(tableau);

    }

    // premiere approche de solution

    public static void plageMax(int[] tab) {
        int max = tab[0];
        int index = 0;
        List<Integer> plages = new ArrayList<>();

        for (int i = 1; i < tab.length; i++) {
            // a chaque fois je recupere
            if (max < tab[i]) {
                max = tab[i];
                index = i;
                plages.add(index);
            }

        }
        System.out.println(plages);

        System.out.println("[" + plages.get(0) + "," + plages.get(plages.size() - 1) + "]");

    }

}

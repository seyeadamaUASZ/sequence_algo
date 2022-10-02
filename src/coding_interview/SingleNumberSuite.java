package coding_interview;

import java.util.HashSet;
import java.util.Set;

/**
 * Seconde approche en prenant en
 * l'optimisation avec la complexité algorithmique
 * TC : O(n), SC : O(n) --> O(1)
 * XOR
 * A ^ A = 0
 * A ^ 0 = A
 * comme solution on peut utiliser
 * l'operateur xor de comparaison entre
 * les elements et sortir le single element
 */

public class SingleNumberSuite {

    public static void main(String[] args) {
        int[] tabs = { 1, 2, 2, 1, 4 };
        System.out.println(singleNumber(tabs));
    }

    // seconde approche
    // TC : O(n), SC : O(n) --> O(1)
    public int single(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                set.remove(nums[i]);
            } else {
                set.add(nums[i]);
            }
        }
        return set.iterator().next();
    }

    // pour la troisieme approche optimal avec XOR
    // TC : O(n), SC : O(1)
    public static int singleNumber(int[] tableau) {
        int el_one = tableau[0];
        for (int i = 1; i < tableau.length; i++) {
            el_one = el_one ^ tableau[i];
        }
        return el_one;
        // complexite evaluée
    }

}

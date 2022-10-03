package coding_interview;

/**
 * reverser un nombre entier
 * ex: 123 -- 321
 */
public class ReverseInteger {

    public static void main(String[] args) {

        // approche plus simple et assez manquant pour les entiers non signés

        /*
         * int nombre = 123;
         * 
         * StringBuilder number = new StringBuilder();
         * number.append(nombre);
         * System.out.println("number " + number.reverse().toString());
         */

        // test

        int n = -123;
        System.out.println(reverse(n));

    }

    // la seconde approche de résolution
    // min = -2147483648
    // max = 2147483647

    /*
     * while (x != 0)
     * lastDigit = x % 10;
     * on verifie si le resultat de la division
     * entiere reversed > max / 10 || (reversed == max/10 && lastDigit > 7)
     * 
     * 
     * on verifie si le resultat de la division
     * entiere reversed < min / 10 || (reversed == min/10 && lastDigit < -8)
     * on retourne 0
     * sinon
     * x = x/10;
     * complexité
     * TC: O(log n),SC: O(1)
     */

    public static int reverse(int x) {
        int reversed = 0;
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        System.out.println("max " + max);

        while (x != 0) {
            int lastDigit = x % 10;
            if (reversed > max / 10 || (reversed == max / 10 && lastDigit > 7))
                return 0;

            if (reversed < min / 10 || (reversed == min / 10 && lastDigit < -8))
                return 0;

            reversed = reversed * 10 + lastDigit;

            x = x / 10;
        }
        return reversed;
    }

}

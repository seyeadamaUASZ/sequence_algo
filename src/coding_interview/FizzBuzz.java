package coding_interview;

import java.util.ArrayList;
import java.util.List;

/**
 * fizz buzz est un exemple typique
 * d'algorithme d'affichage fizz ou buzz lors des
 * entretiens i%3==0 && i%5==0 affiche fizzbuzz
 * i%3 == 0 fizz
 * i%5 == 0 buzz
 * sinon affiche int
 * complexité depend de N entree 0(n)
 */
public class FizzBuzz {

    public static void main(String[] args) {
        int n = 15;
        fizzbuzz(n);
    }

    public static void fizzbuzz(int n) {
        List<String> listes = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                listes.add("fizzbuzz");
            } else if (i % 3 == 0) {
                listes.add("fizz");
            } else if (i % 5 == 0) {
                listes.add("buzz");
            } else {
                listes.add(Integer.toString(i));
            }

        }

        System.out.println(listes);

    }

}

package astuces;

import java.util.Arrays;
import java.util.List;

public class StreamReduce {
    public static void main(String[] args) {
        Integer[] tab = { 1, 2, 4, 5, 6 };
        List<Integer> numbers = Arrays.asList(tab);
        int result = numbers
                .stream()
                .reduce(0, (subtotal, element) -> subtotal + element);

        System.out.println("resultat " + result);

    }
}

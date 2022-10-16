package coding_interview;

public class NthRootNumber {
    public static void main(String[] args) {
        System.out.println(rooth(27, 3));
    }

    // racine d'un nombre avec comme erreur fixe 0.001
    // trouver juste l'intervalle plus proche ou exacte
    // au nombre evalué à puissance
    // ex: racine 3 de 27 --- x = 27 et n = 3 trouver le nombre racine
    // permettant d'avoir un plus ou moins egal à 27 sans etre sup
    // error = 0.0O1

    public static double rooth(double x, int n) {
        double error = 0.001;
        double left = 1.0;
        double right = x;

        while ((right - left) > error) {
            double mid = (left + right) / 2.0;
            if (multiply(mid, n) > x) {
                right = mid;
            } else {
                left = mid;
            }
        }
        return left;
    }

    public static double multiply(double x, int n) {
        double result = 1.0;
        for (int i = 0; i <= n; i++) {
            result = result * x;
        }
        return result;
    }
}

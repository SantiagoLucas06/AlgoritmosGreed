import java.util.ArrayList;
import java.util.List;

public class Subconjuntos {

    public static List<List<Integer>> calcularSubconjuntos(int[] S, int n) {
        List<List<Integer>> result = new ArrayList<>();
        calcularSubconjuntos(S, n, 0, new ArrayList<>(), result);
        return result;
    }

    private static void calcularSubconjuntos(int[] S, int n, int start, List<Integer> subset, List<List<Integer>> result) {
        if (subset.size() == n) {
            result.add(new ArrayList<>(subset));
            return;
        }

        for (int i = start; i < S.length; i++) {
            subset.add(S[i]);
            calcularSubconjuntos(S, n, i + 1, subset, result);
            subset.remove(subset.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] S1 = {1, 2, 3};
        int n1 = 2;
        List<List<Integer>> subconjuntos1 = calcularSubconjuntos(S1, n1);
        System.out.println("Subconjuntos de " + n1 + " elementos de " + arrayToString(S1) + ":");
        imprimirLista(subconjuntos1);

        int[] S2 = {1, 2, 3, 4};
        int n2 = 1;
        List<List<Integer>> subconjuntos2 = calcularSubconjuntos(S2, n2);
        System.out.println("\nSubconjuntos de " + n2 + " elementos de " + arrayToString(S2) + ":");
        imprimirLista(subconjuntos2);
    }

    private static void imprimirLista(List<List<Integer>> lista) {
        for (List<Integer> subset : lista) {
            System.out.println(subset);
        }
    }

    private static String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i < arr.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}

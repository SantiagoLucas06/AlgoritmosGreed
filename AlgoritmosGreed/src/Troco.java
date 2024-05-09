import java.util.Arrays;

public class Troco {

    public static int minNumeroMoedas(int[] moedas, int quantia) {
        Arrays.sort(moedas);
        int numMoedas = 0;

        for (int i = moedas.length - 1; i >= 0; i--) {
            while (quantia >= moedas[i]) {
                quantia -= moedas[i];
                numMoedas++;
            }
        }

        return numMoedas;
    }

    public static void main(String[] args) {
        int[] moedas = {5, 2, 1};
        int quantia = 18;
        int numMoedas = minNumeroMoedas(moedas, quantia);
        System.out.println("Menor número de moedas necessário para dar troco de " + quantia + ": " + numMoedas);
    }
}

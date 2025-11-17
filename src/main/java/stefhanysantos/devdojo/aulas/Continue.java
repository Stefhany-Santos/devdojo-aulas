package stefhanysantos.devdojo.aulas;

public class Continue {
    public static void main(String[] args) {
        double valorTotal = 10000;

        for (int parcela = 1; parcela <= valorTotal; parcela++) {
            double valorParcela = valorTotal / parcela;

            if (valorParcela < 1000) {
                continue; // pula as parcelas menores que 1000
            }

            System.out.println("Parcela " + parcela + "x R$ " + valorParcela);
        }

    }
}

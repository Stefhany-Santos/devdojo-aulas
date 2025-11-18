package stefhanysantos.devdojo.aulas.introducao.exercicios;

import java.util.Scanner;

public class Exercicio {

    private static final double FAIXA1_LIMITE = 34712;
    private static final double FAIXA2_LIMITE = 68507;

    private static final double TAXA1 = 0.0970;
    private static final double TAXA2 = 0.3735;
    private static final double TAXA3 = 0.4950;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o salário anual: € ");
        double salario = sc.nextDouble();

        // Não fechar scanner ligado ao System.in
        double imposto = calcularImposto(salario);

        System.out.printf("Imposto a pagar: € %.2f%n", imposto);
    }

    public static double calcularImposto(double salario) {
        double imposto = 0;

        if (salario <= FAIXA1_LIMITE) {
            imposto = salario * TAXA1;

        } else if (salario <= FAIXA2_LIMITE) {
            imposto  = FAIXA1_LIMITE * TAXA1;
            imposto += (salario - FAIXA1_LIMITE) * TAXA2;

        } else {
            imposto  = FAIXA1_LIMITE * TAXA1;
            imposto += (FAIXA2_LIMITE - FAIXA1_LIMITE) * TAXA2;
            imposto += (salario - FAIXA2_LIMITE) * TAXA3;
        }

        return imposto;
    }
}

package stefhanysantos.devdojo.aulas.introducao;

public class TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Maria";
        String endereco = "Av. Joao Pessoa";
        double salario = 2.500;
        String dataRecebimentoSalario = "20/12/2025";

        String relatorio = "Eu " + nome + " morando no endereco " + endereco + " confirmo que recebi o salário de " + salario + ", na data " + dataRecebimentoSalario;
        System.out.println(relatorio);
    }
}

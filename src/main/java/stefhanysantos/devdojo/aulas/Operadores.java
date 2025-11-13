package stefhanysantos.devdojo.aulas;

public class Operadores {
    public static void main(String[] args){
        // + - /*
        int numero01 = 10;
        int numero02 = 20;
        double resultado = numero01 + numero02;
        System.out.println(resultado);

        // %
        int resto = 21 / 7;
        System.out.println(resto);

        // < >  <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualQueVinte = 10 == 20;
        boolean isDezDiferenteQueVinte = 10 != 20;
        System.out.println("Menor? " + isDezMaiorQueVinte);
        System.out.println("Maior? " + isDezMenorQueVinte);
        System.out.println("Igual? " + isDezIgualQueVinte);
        System.out.println("Diferente? " + isDezDiferenteQueVinte);
    }
}

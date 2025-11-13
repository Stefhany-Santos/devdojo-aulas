package stefhanysantos.devdojo.aulas;

public class TiposPrimitivos {
    // tecla de atalho: psvm
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean

        int age = 10;
        long numeroGrande = 1000000;
        double salarioDouble = 2000.D;
        float salarioFloat = 2500.0F;
        byte idadeByte = 25;
        short idadeShort = 25;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 'A';

        // Consting - serve para colocar/forçar um tipo de váriavel dentro de outro tipo
        int idade = (int) 100000000000L;

        // String
        String nome = "Joao";

        System.out.println("Nome: " + nome);
    }
}

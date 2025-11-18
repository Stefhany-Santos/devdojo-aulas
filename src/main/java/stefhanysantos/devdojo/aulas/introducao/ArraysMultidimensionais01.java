package stefhanysantos.devdojo.aulas.introducao;

public class ArraysMultidimensionais01 {
    public static void main(String[] args) {
        // Primeiro Array: Representa os meses do ano
        // Segundo Array: Representa os dias

        int[][] dias = new int[12][];
        dias[0][0] = 31;
        dias[0][1] = 28;
        dias[0][2] = 31;

        dias[1][0] = 31;
        dias[1][1] = 28;
        dias[1][2] = 31;

        System.out.println(dias[0][0]);
    }
}

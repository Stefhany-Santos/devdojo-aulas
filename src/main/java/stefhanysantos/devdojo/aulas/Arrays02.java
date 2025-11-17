package stefhanysantos.devdojo.aulas;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {

        /*
         * ===================== INTRODUÇÃO A ARRAYS EM JAVA =====================
         *
         * 1) O que é um Array?
         * - Array é uma estrutura de dados que armazena uma sequência de elementos
         *   do MESMO tipo (primitivo ou referência).
         * - É um OBJETO no Java (mesmo sendo array de tipos primitivos).
         * - Tem tamanho FIXO: depois de criado, não cresce nem diminui.
         * - Armazena seus elementos de forma contígua (um ao lado do outro) na memória.
         * - Acesso aos elementos é por índice, começando em ZERO.
         *
         *    Exemplo visual:
         *    float[] idades = new float[3];
         *    índices:   0     1     2
         *    valores: [0.0, 0.0, 0.0]
         *
         * 2) Onde o array vive na memória?
         * - Arrays são criados no HEAP, por isso SEMPRE recebem valores padrão.
         * - A variável (ex: idades) guarda uma REFERÊNCIA para esse array.
         *
         * 3) Valores padrão dos tipos dentro de arrays:
         * - byte, short, int, long → 0
         * - float, double → 0.0
         * - char → '\u0000' (caractere vazio)
         * - boolean → false
         * - String / objetos → null
         *
         * 4) Como acessar elementos:
         *    idades[0]  → primeiro elemento
         *    idades[idades.length - 1] → último elemento
         *
         * 5) Cuidado com índices inválidos:
         *    Se acessar um índice que não existe:
         *    → ArrayIndexOutOfBoundsException
         *
         * 6) Para imprimir arrays corretamente:
         * - System.out.println(idades) mostra apenas o endereço de memória do array.
         * - Use Arrays.toString(idades) para imprimir os valores do array.
         *
         * 7) Atributo importante:
         * - idades.length → retorna o tamanho do array (não é método!)
         *
         * =======================================================================
         */

        float[] idades = new float[3];
        idades[0] = 1;
        idades[1] = 2;
        idades[2] = 3;

        System.out.println("Idades: " + Arrays.toString(idades));
    }
}

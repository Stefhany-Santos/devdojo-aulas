package stefhanysantos.devdojo.aulas;

public class Arrays04 {
    public static void main(String[] args) {
        // formas de declarar um array
        int[] numeros = new int [3];
        int[] numeros2 = {1,2,3,4,5};
        int[] numeros3 = new int[]{5,4,3,2,1};

        for (int num : numeros3){
            System.out.println(num);
        }
    }
}

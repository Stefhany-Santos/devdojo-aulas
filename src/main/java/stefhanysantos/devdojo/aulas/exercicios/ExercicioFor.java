package stefhanysantos.devdojo.aulas.exercicios;

// Exercícios: Imprima os números pares
public class ExercicioFor {
    public static void main(String[] args) {

        // for (int i = 0; i < 10; i += 2){
        //      System.out.println(i);
        //}

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}

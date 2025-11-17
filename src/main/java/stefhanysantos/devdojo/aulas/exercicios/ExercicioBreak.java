package stefhanysantos.devdojo.aulas.exercicios;

// Tarefa: Dados os números de 0 até 50, imprima os primeiros 25 números e depois pare de executar o laço de repetição;
public class ExercicioBreak {
    public static void main(String[] args) {
        for (int i = 0; i <= 50; i++){
            if (i > 25){
                break;
            }
            System.out.println(i);
        }
    }
}

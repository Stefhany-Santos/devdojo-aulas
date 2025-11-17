package stefhanysantos.devdojo.aulas.exercicios;

import java.util.Scanner;

// Tarefa: Dado um valor de um carro, descubra quantas vezes ele pode ser parcelado
public class ExercicioBreak02 {
    public static void main(String[] args) {
        double valorDoCarro = 30000;

        for (int parcela = 1; parcela <= valorDoCarro; parcela++) {
            double valorParcela = valorDoCarro / parcela;

            if (valorParcela < 1000){
              break;
            }
            
            System.out.println("Parcela" + parcela+ "R$ "+valorParcela);
        }

    }
}

package stefhanysantos.devdojo.aulas.javacore.introducaoclasses.test;

import stefhanysantos.devdojo.aulas.javacore.introducaoclasses.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante  estudante2 = new Estudante();

        estudante.nome = "Sanji";

        System.out.println("Nome: " + estudante.nome);
        System.out.println("Sexo: " + estudante.sexo);
        System.out.println("Idade: " + estudante.idade);
    }
}

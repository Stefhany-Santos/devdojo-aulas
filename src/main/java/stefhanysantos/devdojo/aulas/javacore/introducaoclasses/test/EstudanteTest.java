package stefhanysantos.devdojo.aulas.javacore.introducaoclasses.test;

import stefhanysantos.devdojo.aulas.javacore.introducaoclasses.dominio.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Pedro";
        estudante.sexo = 'M';
        estudante.idade = 30;

        System.out.println(estudante.nome);
    }
}

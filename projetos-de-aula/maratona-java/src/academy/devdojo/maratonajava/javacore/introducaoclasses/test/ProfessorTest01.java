package academy.devdojo.maratonajava.javacore.introducaoclasses.test;

import academy.devdojo.maratonajava.javacore.introducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.nome = "Rosely";
        professor.idade = 56;
        professor.sexo = 'F';

        System.out.println(professor.nome + " " + professor.idade + " " + professor.sexo);
    }
}

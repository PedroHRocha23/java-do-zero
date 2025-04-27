# Tipos primitivos
## Parte 03

- preciso especificar se é um float(f) ou um double(d)

```java

package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {

        int idade = (int) 10000000000000L; //Casting -> Forçar a entrada de um valor num tipo
        long numeroGrande = 100000;
        double salarioDouble = 2000.0d;
        float salarioFloat = 2500.0f;
        byte idadeByte = 127;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso =  false;
        char caractere = 'M';

        System.out.println("A idade é " + idade + " anos");
    }
}


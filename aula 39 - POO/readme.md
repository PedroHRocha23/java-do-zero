# Aula 39 e 40 -  Introdução

- Classe de Dominio -> Uma classe que representa algo no mundo real e não precisa necessariamente de uma função main:
```java
public class Exemplo{
    public static void main(String[] args){

    }
}

```

- Classes possuem atributos(caracteristicas do item sendo representado) e metodos (o que esse item tem capacidade de fazer)


## Exemplo de uma Classe:

```java
package academy.devdojo.maratonajava.javacore.introducaoclasses.test;

import academy.devdojo.maratonajava.javacore.introducaoclasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args){
        Estudante estudante = new Estudante();
        estudante.nome = "Pedro";
        estudante.idade = 21;
        estudante.sexo = 'M';
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
```

# Aula 41 - Coesão

- Coesão -> Esta relacionado ao propósito das suas classes

- "Meu código é altamente coeso" -> Quer dizer que as classes não estão misturando o propósito delas de existir

# Aula 42 - Exercicios de Classe

- Classe CARRO

```java

package academy.devdojo.maratonajava.javacore.introducaoclasses.dominio;

public class Carro {

    public String marca;
    public String modelo;
    public int ano;
}
```
- Testando a Classe



```java
package academy.devdojo.maratonajava.javacore.introducaoclasses.test;

import academy.devdojo.maratonajava.javacore.introducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

    carro1.marca = "Toyota";
    carro1.modelo = "Yaris";
    carro1.ano = 2023;

    carro2.marca = "Chevrolet";
    carro2.modelo = "Celta";
    carro2.ano = 2012;

    System.out.println("Marca:" + carro1.marca + " Modelo:" + carro1.modelo + " Ano:" + carro1.ano);
    System.out.println("Marca:" + carro2.marca + " Modelo:" + carro2.modelo + " Ano:" + carro2.ano);



    }
}
```

# Aula 43 - Duas variáveis referenciando o mesmo objeto

carro1 = carro2
# Arrays
 ```java

public class Aula07Arrays01 {
    public static void main(String[] args) {
        int[] idades = new int[3];
        System.out.println(idades[0]);
    }
}

```
- declaração de espaços != indice
    array de 3 espaços vai ata o indice 2, ou seja, total de espaço - 1;

- Arrays são considerados objetos na memória;

- cada tipo de array tem um valor de inicialização padrão:
    - int, short, float, long, byte, double = 0
    - char =  \u0000
    - boolean = false
    - String = null
    
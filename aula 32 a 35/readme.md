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

# Formas de inicializar um array

```java
public class Aula07Arrays03 {
    public static void main(String[] args) {
        int[] numeros = new int[3];

        int[] numeros2 = {1,2,3,4,5};
        
        int[]numeros3 = new int[]{1,2,3,4,5};

        for (int i=0; i<numeros2.length; i++){
            System.out.println(numeros2[i]);
        }
    }
}
```

## Foreach

```java
for (int num:numeros3){
        System.out.println(num);
}
```




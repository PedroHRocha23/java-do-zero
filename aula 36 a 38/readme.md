# Arrays Multidimensionais

```java

public class Aula08ArraysMultidimensionais01 {
    public static void main(String[] args) {
        
        int[][] dias = new int[3][3];

        dias[0][0] = 00;
        dias[0][1] = 01;
        dias[0][2] = 02;
        dias[1][0] = 10;
        dias[1][1] = 11;
        dias[1][2] = 12;
        dias[2][0] = 20;
        dias[2][1] = 21;
        dias[2][2] = 22;

        for(int i=0; i<dias.length;i++){
            for (int j=0; j < dias[i].length; j++){
                System.out.println("Posição [" + i + "][" + j + "] = " + dias[i][j]);
            }
        }


    }
}
```

## ForEach

```java

  for (int[] arrBase: dias){
            for (int num: arrBase){
                System.out.println(num);
            }
        }

```

## Formas de Inicialização

```java
public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int[][] arrayInt = new int[3][];

        arrayInt[0] = new int[2];
        arrayInt[1] = new int[]{1,2,3};
        arrayInt[2] = new int[6];

        int[][] arrayInt2 = {{0,0},{1,2,3},{1,2,3,4,5,6}};

        for (int[] arrayBase: arrayInt2){
            System.out.println("\n--------");
            for (int num: arrayBase){
                System.out.print(num + " ");
            }
        }
    }
}
```
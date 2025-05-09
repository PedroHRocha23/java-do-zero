package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais01 {
    public static void main(String[] args) {
        // Calendário com arryas multidimensionais
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

        for (int[] arrBase: dias){
            for (int num: arrBase){
                System.out.println(num);
            }
        }
    }
}

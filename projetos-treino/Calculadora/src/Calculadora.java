import java.util.Scanner;

public class Calculadora {

    public static void menu(){
        String menu;
        menu =
                """
                \nSelecione o cálculo desejado:
                1 - Soma
                2 - Subtração
                3 - Multiplicação
                4 - Divisão
                """;
        System.out.println(menu);
    }

    public static float soma(float num1, float num2){
        return num1 + num2;
    }

    public static float sub(float num1, float num2){
        return num1 - num2;
    }

    public static float mult(float num1, float num2){
        return num1 * num2;
    }

    public static float div(float num1, float num2){
       return num1 / num2;
    }

    public static void imprimirResultado(float result){
        System.out.println("Resultado: " + result);
    }


    public static void main(String[] args){

        short opcao;
        float num1, num2, resultado;
        resultado = 0.0f;

        menu();
        Scanner input = new Scanner(System.in);
        System.out.println("\nEscolha uma opção:");
        opcao = input.nextShort();

        System.out.println("Digite o primeiro número: ");
        num1 = input.nextFloat();

        System.out.println("Digite o segundo número: ");
        num2 = input.nextFloat();

        switch(opcao){
            case 1:
                resultado = soma(num1,num2);
                imprimirResultado(resultado);
                break;
            case 2:
                resultado = sub(num1, num2);
                imprimirResultado(resultado);
                break;
            case 3:
                resultado = mult(num1, num2);
                imprimirResultado(resultado);
                break;
            case 4:
                if(num2 == 0){
                    System.out.println("Erro! Divisão por 0!");
                }else{
                    resultado = div(num1, num2);
                    imprimirResultado(resultado);
                }
            default:
                System.out.println("Opção inválida");

        }
    }
}



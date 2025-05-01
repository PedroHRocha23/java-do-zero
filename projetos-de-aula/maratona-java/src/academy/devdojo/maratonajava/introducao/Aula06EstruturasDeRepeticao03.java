package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao03 {
    //Dado o valor de um carro, em quantas vezes eu posso parcelar esse valor.
    //Condições: a parcela precisa ser >= 1000 reais

    public static void main(String[] args) {

        double valorDoCarro = 86000;

        for (int parcela = 1;parcela <= valorDoCarro; parcela++){
            double valorParcela =  valorDoCarro / parcela;
            if (valorParcela < 1000){
                break;
            }
            System.out.println(parcela + "X de R$" + valorParcela);

        }
    }
}

package academy.devdojo.maratonajava.introducao;

/*
Prática:

Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>,
confirmo que recebi o salário de <salario>, na data <data>
*/

public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args){
        String nome = "Pedro";
        String endereco = "Rua dos bobos, N° 0";
        float salario = 3500.0f;
        String dataRecebimentoSalario = "27/04/2025";

        System.out.println("Eu " + nome + ", morando no endereço " + endereco + ", confirmo que recebi o salário de R$" + salario + ",na data " + dataRecebimentoSalario);
    }
}

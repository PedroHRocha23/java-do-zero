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

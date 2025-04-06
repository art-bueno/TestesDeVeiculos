package org.example;
import java.util.Scanner;

public class Veiculo {
    private String modelo;
    private double valorDiaria;

    public Veiculo(String modelo, double valorDiaria){
        if (valorDiaria <= 0){
            throw new IllegalArgumentException("O valor da diária não pode ser negativo");
        }

        this.modelo = modelo;
        this.valorDiaria = valorDiaria;

    }

    public double calcularCusto(int dias){
        if(dias <= 0){
            throw  new IllegalArgumentException("O número de dias não pode ser negativo");


        }
        double custoTotal = dias * valorDiaria;
        return desconto(dias, custoTotal);
    }

    private double desconto(int dias, double custoTotal){
        if(dias >= 7){
            return custoTotal * 0.9;
        }
        return custoTotal;
    }

    public static void main(String[] args) {
        Veiculo carro = new Veiculo("SUV", 175); // categorias disponíveis são Sedan, SUV, Compacto e Luxo
        int diarias = 7;
        System.out.println("Custo total do aluguel: " + carro.calcularCusto(diarias));

    }



}

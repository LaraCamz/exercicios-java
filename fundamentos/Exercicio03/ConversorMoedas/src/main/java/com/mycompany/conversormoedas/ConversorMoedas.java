package com.mycompany.conversormoedas;

import java.util.Scanner;

public class ConversorMoedas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double dolar, euro, libra;

        System.out.println("Menu\n"
                + "(1) Real para Dólar \n"
                + "(2) Real para Euro \n"
                + "(3) Real para Libra \n"
                + "(4) Sair\n");

        System.out.println("Digite o codigo da conversão ou (sair): ");
        int codigo = sc.nextInt();

        if (codigo == 4) {
            System.out.println("Programa Finalizado!");
            return;
        } else {

            System.out.println("Digite o Valor para a conversão: ");
            double valor = sc.nextDouble();

            switch (codigo) {
                case 1:
                    dolar = 5.49;
                    valor *= dolar;
                    System.out.printf("Valor em Dólar: %.2f\n", valor);
                    break;
                case 2:
                    euro = 6.32;
                    valor *= euro;
                    System.out.printf("Valor em Euro: %.2f\n", valor);
                    break;
                case 3:
                    libra = 7.39;
                    valor *= libra;
                    System.out.printf("Valor em Libra: %.2f\n", valor);
                    break;
                default:
                    System.out.println("Código inválido!");
                    break;
            }
        }
    }
}

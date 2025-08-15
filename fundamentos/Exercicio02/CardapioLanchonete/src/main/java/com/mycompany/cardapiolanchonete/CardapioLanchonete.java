package com.mycompany.cardapiolanchonete;

import java.util.Scanner;

public class CardapioLanchonete {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int codigo;
        double preco;
        double soma = 0;

        System.out.println("Menu\n"
                + "(1) X-Buguer = 5,00\n"
                + "(2) Refrigerante = 2,00\n"
                + "(3) X-Salada = 4,00\n"
                + "(4) Cachorro-quente = 5,00\n"
                + "(5) X-Especial = 8,00\n");

        while (true) {
            System.out.println("Digite o código do produto ou 0 para sair: ");
            codigo = sc.nextInt();

            if (codigo == 0) {
                break;
            } else {

                switch (codigo) {
                    case 1:
                        System.out.println("X-Buguer");
                        preco = 5.00;
                        soma += preco;
                        break;
                    case 2:
                        System.out.println("Refrigerante");
                        preco = 2.00;
                        soma += preco;
                        break;

                    case 3:
                        System.out.println("X-Salada");
                        preco = 4.00;
                        soma += preco;
                        break;

                    case 4:
                        System.out.println("Cachorro-quente");
                        preco = 5.00;
                        soma += preco;
                        break;

                    case 5:
                        System.out.println("X-Especial");
                        preco = 8.00;
                        soma += preco;
                        break;

                    default:
                        System.out.println("Codigo Inválido!");
                        break;

                }
            }
        }
        System.out.println("Total: " + soma);
    }
}

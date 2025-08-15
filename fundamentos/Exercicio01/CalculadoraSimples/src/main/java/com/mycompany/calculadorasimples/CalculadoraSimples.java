package com.mycompany.calculadorasimples;

import java.util.Scanner;

public class CalculadoraSimples {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num1, num2;
        double calculo;
        String operacao;

        System.out.println("Escolha uma operação: Adição(+), Subtração(-), Multiplicação(*), divisão(/)");
        operacao = sc.next();

        System.out.println("Digite dois números: ");
        num1 = sc.nextDouble();
        num2 = sc.nextDouble();

        switch (operacao) {
            case "+":
                calculo = num1 + num2;
                System.out.printf("%.2f + %.2f = %.2f\n", num1, num2, calculo);
                break;
            case "-":
                calculo = num1 - num2;
                System.out.printf("%.2f - %.2f = %.2f\n", num1, num2, calculo);
                break;
            case "*":
                calculo = num1 * num2;
                System.out.printf("%.2f * %.2f = %.2f\n", num1, num2, calculo);
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("Erro! não é possivel dividir por zero.");
                } else {
                    calculo = num1 / num2;
                    System.out.printf("%.2f / %.2f = %.2f\n", num1, num2, calculo);
                }
                break;
            default:
                System.out.println("Error! verifique a escolha da operação novamente.");
                break;

        }

    }
}

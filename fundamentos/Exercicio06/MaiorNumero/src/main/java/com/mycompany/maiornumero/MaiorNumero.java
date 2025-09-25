package com.mycompany.MaiorNumero;

import java.util.Scanner;

public class MaiorNumero {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num1 = sc.nextInt();

        System.out.println("Digite outro número: ");
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " é maior que " + num2);
        } else if (num1 < num2) {
            System.out.println(num1 + " é menor que " + num2);
        } else {
            System.out.println("Os dois são iguais.");
        }
    }

}

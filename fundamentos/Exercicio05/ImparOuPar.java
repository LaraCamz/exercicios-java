package com.mycompany.exercicio09;

import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int num1 = sc.nextInt();

        if (num1 % 2 == 0) {
            System.out.println("É PAR!");
        } else {
            System.out.println("É IMPAR!");
        }
    }
}

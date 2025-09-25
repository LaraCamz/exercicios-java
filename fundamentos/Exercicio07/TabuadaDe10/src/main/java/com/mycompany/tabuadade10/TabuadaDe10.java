package com.mycompany.TabuadaDe10;

import java.util.Scanner;

public class TabuadaDe10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Tabuada até 10!");
        System.out.println("");
        System.out.println("Digite um número: ");
        int num1 = sc.nextInt();

        for (int i = 1; i < 11; i++) {
            int resultado = num1 * i;
            System.out.println(num1 + " * " + i + " = " + resultado);

        }

    }

}

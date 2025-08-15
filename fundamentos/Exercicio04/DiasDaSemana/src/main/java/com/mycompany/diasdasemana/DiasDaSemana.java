package com.mycompany.diasdasemana;

import java.util.Scanner;

public class DiasDaSemana {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int diaSemana;

        System.out.println("Digite o número da semana: ");
        diaSemana = sc.nextInt();

        switch (diaSemana) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-Feira");
                break;
            case 3:
                System.out.println("Terça-Feira");
                break;
            case 4:
                System.out.println("Quarta-Feira");
                break;
            case 5:
                System.out.println("Quinta-Feira");
                break;
            case 6:
                System.out.println("Sexta-Feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Dia inválido! Digite um número de 1 a 7");
                break;
        }

    }
}

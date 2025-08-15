package application;

import entities.Student;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();
        System.out.println("Qual o nome do aluno? ");
        student.nome = sc.next();
        System.out.println("");

        System.out.println("Digite suas três notas: ");
        student.nota1t = sc.nextDouble();
        student.nota2t = sc.nextDouble();
        student.nota3t = sc.nextDouble();
        System.out.println("");

        System.out.println("DOCUMENTO: ");
        System.out.println("");
        System.out.println(student);

    }

}

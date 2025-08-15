package entities;

public class Student {

    public String nome;
    public double nota1t, nota2t, nota3t;
    

    public double notas() {
        return nota1t + nota2t + nota3t;

    }

    public double pontosFaltando() {
        if (notas() < 60) {
            return 60 - notas();
        } else {
            return 0;
        }
    }

    public String status() {
        if (notas() >= 60) {
            return "APROVADO";

        } else {
            return "REPROVADO";

        }
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\n"
                + "Nota Final:" + String.format("%.2f", notas()) + "\n"
                + "STATUS: " + status() + "\n"
                + "Pontos Faltando: " + String.format("%.2f", pontosFaltando());

    }

}

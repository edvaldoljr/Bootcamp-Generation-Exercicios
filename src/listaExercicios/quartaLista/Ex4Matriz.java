package listaExercicios.quartaLista;

import java.util.Scanner;

public class Ex4Matriz {
    public static void main(String[] args) {
        // Declaração da matriz para armazenar as notas dos 10 participantes durante os 4 bimestres
        double[][] notas = new double[10][4];

        // Declaração do vetor para armazenar as médias dos 10 participantes
        double[] medias = new double[10];

        // Criação do scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Leitura das notas dos 10 participantes durante os 4 bimestres
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite as 4 notas do participante " + (i + 1) + ":");
            for (int j = 0; j < 4; j++) {
                System.out.print("Nota do bimestre " + (j + 1) + ": ");
                notas[i][j] = scanner.nextDouble();
            }
        }

        // Cálculo das médias de cada participante
        for (int i = 0; i < 10; i++) {
            double soma = 0;
            for (int j = 0; j < 4; j++) {
                soma += notas[i][j];
            }
            medias[i] = soma / 4.0;
        }

        // Exibir as médias de cada participante
        System.out.println("\nMédias dos participantes:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Participante " + (i + 1) + ": " + medias[i]);
        }

        // Fecha o scanner
        scanner.close();
    }
}

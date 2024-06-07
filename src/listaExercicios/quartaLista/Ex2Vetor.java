package listaExercicios.quartaLista;

import java.util.Scanner;

public class Ex2Vetor {
    public static void main(String[] args) {
        // Declaração do vetor para armazenar 10 números inteiros
        int[] vetor = new int[10];

        // Criação do scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Leitura dos 10 números inteiros
        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        // Exibir elementos dos índices ímpares do vetor
        System.out.println("\nElementos nos índices ímpares:");
        for (int i = 1; i < 10; i += 2) {
            System.out.println("Índice " + i + ": " + vetor[i]);
        }

        // Exibir elementos do vetor que são números pares
        System.out.println("\nElementos pares no vetor:");
        for (int i = 0; i < 10; i++) {
            if (vetor[i] % 2 == 0) {
                System.out.println(vetor[i]);
            }
        }

        // Calcular a soma de todos os elementos do vetor
        int soma = 0;
        for (int i = 0; i < 10; i++) {
            soma += vetor[i];
        }
        System.out.println("\nA soma de todos os elementos do vetor é: " + soma);

        // Calcular a média de todos os elementos do vetor
        double media = soma / 10.0;
        System.out.println("A média de todos os elementos do vetor é: " + media);

        // Fecha o scanner
        scanner.close();

    }
}

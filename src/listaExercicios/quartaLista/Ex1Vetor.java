package listaExercicios.quartaLista;

import java.util.Scanner;

public class Ex1Vetor {
    public static void main(String[] args) {
        // Criação do scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Declaração e inicialização do vetor com 10 números inteiros não ordenados e não repetidos
        int[] vetor = {15, 8, 23, 42, 4, 16, 7, 3, 18, 29};


        // Solicita ao usuário que digite um número
        System.out.print("Digite um número para pesquisar no vetor: ");
        int numero = scanner.nextInt();

        // Variável para armazenar a posição do número no vetor
        int posicao = -1; // -1 indica que o número não foi encontrado (valor inicial)

        // Loop para percorrer o vetor e verificar se o número digitado está no vetor
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numero) {
                posicao = i + 1; // Armazena a posição do número no vetor
                break; // Interrompe o loop, pois o número foi encontrado
            }
        }

        // Verifica se o número foi encontrado e exibe a mensagem apropriada
        if (posicao == -1) {
            System.out.println("Não foi encontrado!"); // Número não encontrado no vetor
        } else {
            System.out.println("O número " + numero + " foi encontrado na posição " + posicao); // Número encontrado no vetor
        }

        // Fecha o scanner
        scanner.close();
    }
}


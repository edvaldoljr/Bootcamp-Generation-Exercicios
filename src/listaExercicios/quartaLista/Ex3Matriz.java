package listaExercicios.quartaLista;

import java.util.Scanner;

public class Ex3Matriz {
    public static void main(String[] args) {
        // Declaração da matriz 3x3
        int[][] matriz = new int[3][3];

        // Criação do scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Leitura dos elementos da matriz 3x3
        System.out.println("Digite os elementos da matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Exibir elementos da Diagonal Principal
        System.out.println("\nElementos da Diagonal Principal:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Elemento [" + i + "][" + i + "]: " + matriz[i][i]);
        }

        // Exibir elementos da Diagonal Secundária
        System.out.println("\nElementos da Diagonal Secundária:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Elemento [" + i + "][" + (2 - i) + "]: " + matriz[i][2 - i]);
        }

        // Calcular e exibir a soma dos elementos da Diagonal Principal
        int somaDiagonalPrincipal = 0;
        for (int i = 0; i < 3; i++) {
            somaDiagonalPrincipal += matriz[i][i];
        }
        System.out.println("\nA soma dos elementos da Diagonal Principal é: " + somaDiagonalPrincipal);

        // Calcular e exibir a soma dos elementos da Diagonal Secundária
        int somaDiagonalSecundaria = 0;
        for (int i = 0; i < 3; i++) {
            somaDiagonalSecundaria += matriz[i][2 - i];
        }
        System.out.println("A soma dos elementos da Diagonal Secundária é: " + somaDiagonalSecundaria);

        // Fecha o scanner
        scanner.close();
    }
}

package listaExercicios.terceiraLista;

import java.util.Scanner;

public class Ex5DoWhile {
    /*
    Escreva um algoritmo em Java, que leia números inteiros via teclado, até que o número zero seja digitado.
    Ao final, mostre na tela a soma de todos os números digitados, que sejam positivos. Veja o exemplo abaixo:
     */

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, somaPositivos = 0;
        boolean continuar = true;

        do {
            System.out.print("Digite um número inteiro (ou 0 para sair): ");

            numero = entrada.nextInt();
            if (numero == 0) {
                continuar = false; // Sair do loop ao digitar 0
            } else if (numero > 0) {
                somaPositivos += numero;
            }
        } while (continuar);

        System.out.println("Soma dos números positivos: " + somaPositivos);
        entrada.close();
    }
}

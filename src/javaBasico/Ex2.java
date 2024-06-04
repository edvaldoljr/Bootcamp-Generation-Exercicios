package javaBasico;

//Elabore um algoritmo em Java que leia 4 notas de um
// participante, em variáveis do tipo float e exiba na
// tela a média final do participante.

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

        // Declaração de variaveis
        float[] notas = new float[4];
        float media = 0;
        float mediaFinal = 0;

        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < notas.length; i++ ) {
            System.out.printf("Digite a nota %d: ", i + 1);
            notas[i] = entrada.nextFloat();
        }

        for (int i = 0; i < notas.length; i++) {
            mediaFinal += notas[i];
        }

        mediaFinal /= notas.length;
        System.out.println("A média final é: " + mediaFinal);

//
//        float nota1, nota2, nota3, nota4, media;
//
//        System.out.println("Digite o primeiro nota 1: ");
//        nota1 = entrada.nextFloat();
//        System.out.println("Digite o primeiro nota 2: ");
//        nota2 = entrada.nextFloat();
//        System.out.println("Digite o primeiro nota 3: ");
//        nota3 = entrada.nextFloat();
//        System.out.println("Digite o primeiro nota 4: ");
//        nota4 = entrada.nextFloat();
//
//        media = (nota1 + nota2 + nota3 + nota4) / 4;
//
//        System.out.println("Sua mnedia é: " + media);


    }
}

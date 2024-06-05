package listaExercicios.primeira;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

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
        System.out.printf("A média final é: %.1f " , mediaFinal);

    }
}

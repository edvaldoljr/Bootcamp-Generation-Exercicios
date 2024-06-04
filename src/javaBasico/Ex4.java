package javaBasico;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float[] valores = new float[4];
        float calculo, diferencaProduto;

        for (int i = 0; i < valores.length; i++) {
            System.out.printf("Digite a numero %d: ", i + 1);
            valores[i] = entrada.nextFloat();
        }

        calculo = (valores[0] * valores[1]) - (valores[2] * valores[3]);
        diferencaProduto = calculo;

        System.out.println("A diferença do produto: " + diferencaProduto);
    }

}

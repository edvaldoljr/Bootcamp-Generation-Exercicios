package listaExercicios.terceiraLista;

import java.util.Scanner;

public class Ex2For {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalPar = 0, totalImpar = 0;
        int[] numeros = new int[4];


        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite um numero : ");
            numeros[i] = scanner.nextInt();
            if (numeros[i] % 2 == 0) {
                totalPar = totalPar + 1;
            } else {
                totalImpar = totalImpar + 1;
            }
        }


        System.out.println("Total de numeros PARES: " + totalPar);
        System.out.println("Total de numeros IMPARS: " + totalImpar);
        scanner.close();
    }
}


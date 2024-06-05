package listaExercicios.segunda;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número para verificação");
        int numero = entrada.nextInt();

        String parOuImpar;

        if (numero % 2 == 0) {
            parOuImpar = "Par";
        } else {
            parOuImpar = "Impar";
        }

        if (numero == 0) {
            System.out.println("O número 0 é neutro");
        } else if (numero > 0) {
            System.out.println("O número " + numero + " é " + parOuImpar + " e positivo!");
        } else { // numero < 0
            if (parOuImpar.equals("par")) {
                System.out.println("O número " + numero + " é " + parOuImpar + " e negativo!");
            } else {
                System.out.println("O número " + numero + " é " + parOuImpar + " e negativo!");
            }
        }
    }
}

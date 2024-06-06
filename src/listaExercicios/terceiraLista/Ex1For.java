package listaExercicios.terceiraLista;

/*

Escreva um algoritmo em Java,
que leia 2 números inteiros via teclado, onde o primeiro número deve ser menor do que o segundo número.
Caso contrário, deve ser exibida uma mensagem na tela informando que o intervalo é inválido e sair do programa.
No intervalo informado, mostre na tela todes os números que são múltiplos de 3 e 5. Veja os exemplos abaixo:
 */
import java.util.Scanner;

public class Ex1For {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número do intervalo: ");
        int primeiroNumero = scanner.nextInt();

        System.out.print("Digite o último número do intervalo: ");
        int ultimoNumero = scanner.nextInt();

        if (primeiroNumero > ultimoNumero) {
            System.out.println("Intervalo inválido!");
            return;
        }

        System.out.println("No Intervalo entre " + primeiroNumero + " e " + ultimoNumero + ":");

        for (int numero = primeiroNumero; numero <= ultimoNumero; numero++) {
            if (numero % 3 == 0 && numero % 5 == 0) {
                System.out.println(numero + " é múltiplo de 3 e 5");
            }
        }
        scanner.close();
    }
}

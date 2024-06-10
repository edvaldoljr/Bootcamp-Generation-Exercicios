package listaExercicios.quintaLista;

import java.util.*;

public class Ex4CollectionSet {
    public static void main(String[] args) {
        // Cria um Set de Integer
        Set<Integer> numeros = new HashSet<>();

        // Instancia um objeto Random para gerar números aleatórios
        Random random = new Random();

        // Adiciona 10 valores inteiros aleatórios ao Set
        while (numeros.size() < 10) {
            int numeroAleatorio = random.nextInt(100) + 1; // Gera números entre 0 e 99
            numeros.add(numeroAleatorio);
        }

        // Exibe os números gerados
        System.out.println("Números gerados: " + numeros);

        // Cria um Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        // Verifica se o número está no Set e exibe a mensagem apropriada
        if (numeros.contains(numero)) {
            System.out.println("Número " + numero + " Encontrado!");
        } else {
            System.out.println("O número " + numero + " não foi encontrado!");
        }

        // Fecha o Scanner
        scanner.close();
    }
}

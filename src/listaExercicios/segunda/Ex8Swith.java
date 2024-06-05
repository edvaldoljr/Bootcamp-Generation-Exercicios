package listaExercicios.segunda;

import java.util.Scanner;

public class Ex8Swith {
    public static void main(String[] args) {

        int opcao; // Variável para armazenar a opção do usuário
        float valorOperacao; // Variável para armazenar o valor da operação

        Scanner scanner = new Scanner(System.in); // Criar Scanner para leitura de entrada
        float saldo = scanner.nextFloat(); // Saldo inicial
        // Loop para repetir as operações até que o usuário escolha sair
        while (true) {
            // Apresentar o menu de opções
            System.out.println("\nMenu de Opções:");
            System.out.println("1. Consultar Saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("4. Sair");

            // Ler a opção do usuário
            System.out.print("Digite a opção desejada: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir quebra de linha (evitar erros de leitura)

            // Verificar a opção escolhida e realizar a operação correspondente
            switch (opcao) {
                case 1:
                    System.out.printf("Seu saldo atual é: R$%.2f\n", saldo);
                    break;
                case 2:
                    System.out.print("Digite o valor a ser depositado: R$");
                    valorOperacao = scanner.nextFloat();
                    scanner.nextLine(); // Consumir quebra de linha
                    saldo += valorOperacao;
                    System.out.printf("Depósito realizado com sucesso! Novo saldo: R$%.2f\n", saldo);
                    break;
                case 3:
                    System.out.print("Digite o valor a ser sacado: R$");
                    valorOperacao = scanner.nextFloat();
                    scanner.nextLine(); // Consumir quebra de linha
                    if (saldo >= valorOperacao) {
                        saldo -= valorOperacao;
                        System.out.printf("Saque realizado com sucesso! Novo saldo: R$%.2f\n", saldo);
                    } else {
                        System.out.println("Saldo insuficiente para saque!");
                    }
                    break;
                case 4:
                    System.out.println("Obrigado por usar nossos serviços!");
                    scanner.close(); // Fechar Scanner para liberar recursos
                    return; // Sair do loop
                default:
                    System.out.println("Operação inválida!");
            }
        }

    }
}

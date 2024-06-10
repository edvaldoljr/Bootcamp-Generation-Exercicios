package listaExercicios.sextaLista;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex1Quue {

    public static void menu() {
        System.out.println("======================\n" + "    Menu de Opções" + "\n======================");
        System.out.println("\n1- Adicionar cliente na fila");
        System.out.println("2- Listar todos os clientes");
        System.out.println("3- Retirar cliente da fila");
        System.out.println("0- Retirar cliente da fila");
    }

    public static void main(String[] args) {
        //Declarando e instanciando a nossa Queue;
        Queue<String> FilaDeBanco = new LinkedList<String>();

        Scanner scanner = new Scanner(System.in);
        int opc = 0;

        do {
            menu();
            System.out.println("Digite a opção desejada");
            opc = scanner.nextInt();
            switch (opc) {
                case 1 -> {
                    System.out.println("Digite o nome do cliente");
                    String nome = scanner.next();
                    FilaDeBanco.add(nome);
                }
                case 2 -> {
                    if (FilaDeBanco.isEmpty()) {
                        System.out.println("A Lista está vazia....");
                    } else {
                        System.out.println("---> " + FilaDeBanco);
                    }
                }
                case 3 -> {
                        String PrimeiroClienteOuErro = FilaDeBanco.element();
                        System.out.println("--> " + PrimeiroClienteOuErro);
                        System.out.println("Retirando elemento da fila");
                        String ClienteASerAtendido = FilaDeBanco.poll();
                        System.out.println("--> " + ClienteASerAtendido);
                }
                case 4 ->
                    System.out.println( "finalizando o sistema... ");
            }
        }while (opc != 0);

    }
}

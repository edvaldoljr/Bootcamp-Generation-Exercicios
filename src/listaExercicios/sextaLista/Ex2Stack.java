package listaExercicios.sextaLista;

import java.util.Scanner;
import java.util.Stack;

public class Ex2Stack {
    public static void menu() {

        System.out.println("\t MENU DE OPÇÕES");
        System.out.println("**");
        System.out.println("\n\t1 - Adicionar Livro na Pilha");
        System.out.println("\t2 - Listar todos os livros");
        System.out.println("\t3 - Retirar Livro da Pilha");
        System.out.println("\t0 - Sair");
        System.out.println("\n**");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opc = 0;
        Stack<String> livros = new Stack<>();

        do {
            menu();
            System.out.println("Digite a opção desejada");
            opc = scanner.nextInt();
                switch (opc) {
                    case 1 -> {
                        System.out.println("Digite o nome do Livro");
                        scanner.nextLine();
                        String nome = scanner.nextLine();
                        livros.push(nome);
                    }
                    case 2 -> {
                        if (livros.empty()) {
                            System.out.println("A Lista está vazia....");
                        } else {
                            System.out.println("---> " + livros);
                        }
                    }
                    case 3 -> {
                    System.out.println("Retirando...");
                        livros.pop();
                    }
                    case 0 ->
                            System.out.println( "finalizando o sistema... ");
                }
        }while (opc != 0);
    }
}

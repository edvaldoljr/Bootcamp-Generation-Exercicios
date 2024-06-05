package listaExercicios.segunda;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int idade;
        String nome, resposta;
        boolean truEfalse;

        System.out.println("Digete seu nome: ");
        nome = entrada.nextLine();

        System.out.println("Digite sua idade: ");
        idade = entrada.nextInt();

        System.out.println("Está é sua primeria doação [S] / [N]");
        resposta = entrada.next();

        if (resposta.equalsIgnoreCase("S")) {
           truEfalse = true;
            System.out.println(truEfalse);
        } else if (resposta.equalsIgnoreCase("N")) {
            truEfalse = false;
            System.out.println(truEfalse);
        } else {
            System.out.println("Entrada invalida! ");
        }
    }
}
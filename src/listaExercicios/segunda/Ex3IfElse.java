package listaExercicios.segunda;

import java.util.Scanner;

public class Ex3IfElse {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int idade;
        String nome, resposta;
        boolean truEfalse = false;

        System.out.println("Digete seu nome: ");
        nome = entrada.nextLine();

        System.out.println("Digite sua idade: ");
        idade = entrada.nextInt();

        System.out.println("Está é sua primeria doação [S] / [N]");
        resposta = entrada.next().toUpperCase();

        switch (resposta){
            case "S", "N":
                System.out.println("=== Resultado para Doação ===");
                if (resposta.equals("S")) {
                    truEfalse = true;
                    if (idade >= 60 && idade <= 69){
                        System.out.println(nome + " não está apto para doar sangue!\nIdade: " + idade + "\n Primeira doação de sangue: " + truEfalse);
                    }else if (idade >=  18 || idade < 60 ) {
                        System.out.println(nome + " está apto para doar sangue!\nIdade: " + idade + "\n Primeira doação de sangue: " + truEfalse);
                    }
                } else if (resposta.equalsIgnoreCase("N")) {
                    truEfalse = false;
                    if (idade >= 60 && idade <= 69){
                        System.out.println(nome + " está apto para doar sangue!\nIdade: " + idade + "\n Primeira doação de sangue: " + truEfalse);
                    }else if (idade < 18) {
                        truEfalse = false;
                        System.out.println(nome + " não está apto para doar sangue! \n Idade: " + idade + "\n Primeira doação de sangue: " + false);
                    }
                }else {
                    System.out.println("Opção invalida");
                }
                break;
            default:
                System.out.println("Entrada Invalida.");
        }
        entrada.close();
    }
}
package listaExercicios.terceiraLista;

import java.util.Scanner;

public class Ex3While {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int idade, menorDe21 = 0, maior21 = 0;

        while (true) {
            System.out.println("Digite as idades das pessoas na fila ou [0] para encerrar o programa: ");
            idade = entrada.nextInt();

            if (idade > 0 && idade < 21) {
                menorDe21++;
            } else if (idade >= 21) {
                maior21++;
            } else {
                switch (idade) {
                    case 0:
                        System.out.println("Total de pessoa menores de 21 anos: " + menorDe21);
                        System.out.println("Total de pessoa maior de 21: " + maior21);
                        System.out.println("Obrigado por usar nossos serviços!");
                        entrada.close(); // Fechar Scanner para liberar recursos
                        return; // Sair do loop
                }
            }
        }

    }
}

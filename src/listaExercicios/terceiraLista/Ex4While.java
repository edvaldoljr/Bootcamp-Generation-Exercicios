package listaExercicios.terceiraLista;

import java.util.Scanner;

public class Ex4While {
    //iniciando a classe
    public static void main(String[] args) {

        int indetiGen, idadde, pesoaDev;
        int devBack = 0, devFront = 0, mulherCisTransFron = 0, homCisTransMobMai40 = 0;
        int noaBinFullStackMenos30 = 0, pesosas = 0, mediaIdade, somaIdade = 0;
        String exibirMenuIdentGen = """
                Você se identifica como:
                1- Mulher Cis
                2- Homem Cis
                3- Não Binário
                4- Mulher Trans
                5- Homem Trans
                6- Outros
                """;
        String exibirMenuDev = """
                Você é uma pessoa desenvolvedora:
                1- Backend
                2- Frontend
                3- Mobile
                4- FullStack
                """;

        boolean continuar = true;
        Scanner scanner = new Scanner(System.in);

        while (continuar == true) {
            System.out.println("Qual a sua idade? ");
            idadde = scanner.nextInt();

            System.out.println(exibirMenuIdentGen);
            indetiGen = scanner.nextInt();

            System.out.println(exibirMenuDev);
            pesoaDev = scanner.nextInt();
            if (pesoaDev == 1) {
                devBack += 1;
            } else if (indetiGen == 1 || indetiGen == 4) {
                if (pesoaDev == 2) {
                    mulherCisTransFron += 1;
                }
            } else if (indetiGen == 2 || indetiGen == 5) {
                if (pesoaDev == 3 && idadde > 40) {
                    homCisTransMobMai40 += 1;
                }

            } else if (indetiGen == 3 && pesoaDev == 4) {
                if (idadde <= 30) {
                    noaBinFullStackMenos30 += 1;
                }
            }
            somaIdade += idadde;
            pesosas += 1;
            scanner.nextLine();
            System.out.println("Deseja continuar a pesquisa?");
            continuar = scanner.nextBoolean();
        }
        mediaIdade = somaIdade / pesosas;
        System.out.println(":Número de pessoas desenvolvedoras backend é: " + devBack);
        System.out.println("O numero de mulheres Cis e Trans desnvolvedoras frontend é: " + mulherCisTransFron);
        System.out.println(
                "O número de homens Cis Tran desenvolvedores mobilecom mais de 40 anos é: " + homCisTransMobMai40);
        System.out.println("O número de desenvolvedores Não Binários  FullStack com menos de 30 anos é: "
                + noaBinFullStackMenos30);
        System.out.println("O total de pesoas que responderam essa pesquisa foi de: " + pesosas);
        System.out.println("A média de idade das pessoas que responderam apesquisa foi de: " + mediaIdade);
    }
}

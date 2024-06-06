package listaExercicios.segundaLista;

import java.util.Scanner;

public class Ex6Swith {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float reajusteId1 = 10, reajusteId2 = 7, reajusteId3 = 9, reajusteId4 = 6, reajusteId5 = 5, reajusteId6 = 8;
        System.out.print("Digite o nome do Funcionario: \n");
        String nome = scanner.nextLine();
        System.out.println("Digite o ID Do cargo de 1 a 6: \n");
        int idCargo = scanner.nextInt();
        System.out.println("Digite o salário");
        float salario = scanner.nextFloat();
        float novoSalario;
        String cargo;

        switch (idCargo){
            case 1 -> {
                novoSalario = salario + (reajusteId1 * salario);
                cargo = "Gerente ";
            }
            case 2 -> {
                novoSalario = salario + (reajusteId2 * salario);
                cargo = "Vendedor";
            }
            case 3 -> {
                novoSalario = salario + (reajusteId3 * salario);
                cargo = "Supervisor";
            }
            case 4 -> {
                novoSalario = salario + (reajusteId4 * salario);
                cargo = "Motorista";
            }
            case 5 -> {
                novoSalario = salario + (reajusteId5 * salario);
                cargo = "Estoquista";
            }
            case 6 -> {
                novoSalario = salario + (reajusteId2 * salario);
                cargo = "Técnico de TI";
            }
            default -> {
                System.out.println("Produto inválido!");
                return; // Sai do programa se o produto for inválido
            }
        }
        System.out.printf("Nome Trabalhador: %s\nCargo: %d\nSalário: R$%.2f", nome, idCargo, novoSalario);
    }
}

package listaExercicios.primeiraLista;

import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double salario, abono, novoSalario;

        System.out.println("Digite seu salario: ");
        salario = entrada.nextDouble();

        System.out.println("Digite seu abono: ");
        abono = entrada.nextDouble();

        novoSalario = salario + abono;
        System.out.printf("Novo salario : %.2f" , novoSalario);
    }
}

package javaBasico;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float salarioBruto, adicionalNoturno, horasExtras, descontoCOlaborador, salarioLiquido;

        System.out.println("Digite seu salario Bruto: ");
        salarioBruto = entrada.nextFloat();

        System.out.println("Digite seu adicional noturno: ");
        adicionalNoturno = entrada.nextFloat();

        System.out.println("Digite seu horas extras: ");
        horasExtras = entrada.nextFloat();

        System.out.println("Digite seu Desconto COlaborador: ");
        descontoCOlaborador = entrada.nextFloat();

        salarioLiquido = salarioBruto + (adicionalNoturno + (horasExtras * 5) - descontoCOlaborador);

        System.out.printf("Salario Liquido: %.2f" , salarioLiquido);

    }
}

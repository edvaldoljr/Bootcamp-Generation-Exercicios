package javaBasico;

import java.util.Scanner;

/*
Elabore um algoritmo em Java, que leia o Salário Bruto,
o Adicional Noturno, as Horas Extras e os Descontos de um Colaborador,
em variáveis do tipo float e exiba na tela o Salário Líquido.

SALÁRIO LÍQUIDO = SALÁRIO BRUTO + ADICIONAL NOTURNO + (HORAS EXTRAS * 5) - DESCONTOS
 */
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

        //System.out.println("Salario Liquido: " + salarioLiquido);
        System.out.printf("Salario Liquido: %.2f" , salarioLiquido);

    }
}

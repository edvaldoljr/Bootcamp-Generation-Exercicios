package listaExercicios.segundaLista;

import java.util.Scanner;

public class Ex1IfElse {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float[] numeros = new float[3];
        float soma;


        for (int i = 0; i < numeros.length; i++ ) {
            System.out.printf("Digite um mumero: ");
            numeros[i] = entrada.nextFloat();
        }

        soma =  numeros[0] + numeros[1] ;

        if (soma > numeros[2]) {
            System.out.println("1. A Soma de A + B é Maior do que C");
        } else if (soma < numeros[2]){
            System.out.println("2. A Soma de A + B é Menor do que C");
        }else {
            System.out.println("3. A Soma de A + B é Igual a C");
        }

    }
}

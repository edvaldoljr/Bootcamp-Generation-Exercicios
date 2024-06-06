package listaExercicios.terceiraLista;

import java.util.Scanner;

public class Ex6DoWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num, somaMulti3 =0, contaMult3 = 0;
        float mediaMulti3 = 0;

        do{
            System.out.println("Entre com um numero inteiro");
            num = entrada.nextInt();
            if (num == 0) {
                System.out.println("Você digitou Zero, vamos finalizar o progarama.'");
            }else if (num % 3 ==0){
                somaMulti3 += num;
                contaMult3++;
            }
        }while (num != 0);

        if (contaMult3 == 0) {
            System.out.println("Não foi possivel achar a media...");
        }else {
            mediaMulti3 = somaMulti3 / contaMult3;
            System.out.println("A mmedia foi de: " + mediaMulti3);
        }
    }
}
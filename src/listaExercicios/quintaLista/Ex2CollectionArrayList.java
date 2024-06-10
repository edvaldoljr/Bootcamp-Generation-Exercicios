package listaExercicios.quintaLista;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Ex2CollectionArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean numeroEncontrado = false;

        ArrayList<Integer> lista = new ArrayList<>();
        for (int j = 0; j < 10; j++) {
            int numeroAleatorio = random.nextInt(100) + 1;
            System.out.println(numeroAleatorio);
            lista.add(numeroAleatorio);
        }

        System.out.println("Digite um numero para busca : ");
        int numero = scanner.nextInt();

        for (int i = 0; i < lista.size(); i++) {
            int elementoLista = lista.get(i);
            if (numero == elementoLista) {
                System.out.println("O número " + numero + " está localizado na posicao " + (i + 1) + ".");
                numeroEncontrado = true;
                break;
            }
        }

        if (!numeroEncontrado) {
            System.out.println("Numero não encontrado");
        }
    }
}

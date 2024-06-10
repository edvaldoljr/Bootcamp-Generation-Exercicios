package listaExercicios.quintaLista;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex1CollectionArrayList {
    public static void main(String[] args) {

        //Criando array para armazenar as entradas do usuario
        ArrayList<String> entradas = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        //Solicitando as entradas
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite a cor para entrada no lista" + (i + 1) + ": ");
            String entrada = (scanner.nextLine());
            entradas.add(entrada);
        }

        //Ordenando a lista
        Collections.sort(entradas);

        for (String entrada : entradas) {
            System.out.println(entrada);
        }
    }
}

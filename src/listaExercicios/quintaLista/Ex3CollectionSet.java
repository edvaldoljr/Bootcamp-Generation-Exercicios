package listaExercicios.quintaLista;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Ex3CollectionSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> set = new HashSet<Integer>();
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um numero");
            int numeroEntrada = scanner.nextInt();
                set.add(numeroEntrada);
        }
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            int valor = iterator.next();
            System.out.println(valor);
        }
    }
}

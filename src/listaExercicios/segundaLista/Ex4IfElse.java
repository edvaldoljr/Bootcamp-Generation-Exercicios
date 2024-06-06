package listaExercicios.segundaLista;

import java.util.Scanner;

public class Ex4IfElse {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);

        String entrada1 = "", entrada2 = "", entrada3 = "";

        System.out.println("=== Escola entre as categorias ===\n Categorias [Vertebrado] / [invertebrado]");
        entrada1 = scaner.nextLine();

        if (entrada1.equalsIgnoreCase("Vertebrado")) {
            System.out.println("=== Escola a proxima categoria ===\n[Ave] / [Mamifero]");
            entrada2 = scaner.nextLine();
            if (entrada2.equalsIgnoreCase("Ave")) {
                System.out.println("=== Escola a proxima categoria ===\n[carnivoro] / [Onivoro]");
                entrada3 = scaner.nextLine();
                if (entrada3.equalsIgnoreCase("carnivoro")) {
                    System.out.println("Vertebrado\nAve\nÁguia");
                } else if (entrada3.equalsIgnoreCase("Onivoro")) {
                    System.out.println("Vertebrado\nAve\nPomba");
                } else {
                    System.out.println("Entrada invalida");
                }
            } else if (entrada2.equalsIgnoreCase("Mamifero")) {
                System.out.println("=== Escola a proxima categoria ===\n[Onivoro] / [herbivoro]");
                entrada3 = scaner.nextLine();
                if (entrada3.equalsIgnoreCase("Onivoro")) {
                    System.out.println("vertebrado,\nMamifero\nHomem");
                } else if (entrada3.equalsIgnoreCase("herbivoro")) {
                    System.out.println("vertebrado,\nMamifero\nVaca");
                }
            }
        } else if (entrada1.equalsIgnoreCase("invertebrado")) {
            System.out.println("=== Escola a proxima categoria ===\n[Inseto] / [Anelidio]");
            entrada2 = scaner.nextLine();
            if (entrada2.equalsIgnoreCase("Inseto")) {
                System.out.println("=== Escola a proxima categoria ===\n[Hematofago] / [herbivoro]");
                entrada3 = scaner.nextLine();
                if (entrada3.equalsIgnoreCase("Hematofago")) {
                    System.out.println("Invertabrado\nInseto\nHematofago\nPulga");
                } else if (entrada3.equalsIgnoreCase("herbivoro")) {
                    System.out.println("Invertabrado\nInseto\nHematofago\nLargata");
                } else {
                    System.out.println("Entrada invalida");
                }
            } else if (entrada2.equalsIgnoreCase("Anelideo")) {
                System.out.println("=== Escola a proxima categoria ===\n[Hematofago] / [onivoro]");
                entrada3 = scaner.nextLine();
                if (entrada3.equalsIgnoreCase("Hematofago")){
                    System.out.println("Anelideo\nHematofago\nSangue suga");
                } else if (entrada3.equalsIgnoreCase("onivoro")) {
                    System.out.println("Anelideo\nonivoro\nMinhoca");
                }else {
                    System.out.println("Entrada invalida");
                }
            }
        } else {
            System.out.println("Entrada Invalida");
        }
        scaner.close();
    }
}
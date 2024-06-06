package listaExercicios.segundaLista;

import java.util.Scanner;

public class Ex5Swith {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        float item1 = 10, item2 = 15, item3 = 18, item4 = 12, item5 = 8, item6 = 13;

        System.out.println("Digite o número do produto (1 a 6): ");
        int idProduto = ler.nextInt();

        System.out.println("Digite a quantidade do produto: ");
        int quantidade = ler.nextInt();

        float valorTotal = 0;
        String descricaoProduto = "";

        switch (idProduto) {
                case 1 -> {
                    valorTotal = item1 * quantidade;
                    descricaoProduto = "Cachorro quente";
                }
                case 2 -> {
                    valorTotal = item2 * quantidade;
                    descricaoProduto = "X-Salada";
                }
                case 3 -> {
                    valorTotal = item3 * quantidade;
                    descricaoProduto = "X-Bacon";
                }
                case 4 -> {
                    valorTotal = item4 * quantidade;
                    descricaoProduto = "Bauro";
                }
                case 5 -> {
                    valorTotal = item5 * quantidade;
                    descricaoProduto = "Refigerante";
                }
                case 6 -> {
                    valorTotal = item6 * quantidade;
                    descricaoProduto = "Suco de Laranja";
                }
                default -> {
                    System.out.println("Produto inválido!");
                    return; // Sai do programa se o produto for inválido
                }
            }

        System.out.println("=== PEDIDO ===");
        System.out.printf("Produto: %s\nQuantidade: %d\nValor Total: R$%.2f", descricaoProduto, quantidade, valorTotal);
    }
}
package supermercado.produtos;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class RealizarCompra {
    public static CarrinhoDeCompras realizarCompra() {
        Produto[] produtos = Produto.obterProdutos();
        Scanner scanner = new Scanner(System.in);
        double valorTotal = 0.0;

        System.out.println("Bem-vindo ao sistema de compra de supermercado!");

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        while (true) {
            System.out.println("Escolha um produto pelo seu código para adicionar ao carrinho (ou digite 0 para finalizar a compra):");
            int escolha = scanner.nextInt();

            if (escolha == 0) {
                break;
            } else if (escolha >= 1 && escolha <= produtos.length) {
                Produto produtoEscolhido = produtos[escolha - 1]; // Subtrai 1 para obter o índice correto
                System.out.println("Você escolheu: " + produtoEscolhido.getNome());
                valorTotal += produtoEscolhido.getPreco();
                carrinho.adicionarProduto(produtoEscolhido);
            } else {
                System.out.println("Código de produto inválido. Por favor, escolha um código válido.");
            }
        }
        //scanner.close();
        return carrinho;
    }
}
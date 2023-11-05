package supermercado.produtos;
import supermercado.Main;
import supermercado.revistas.RevistasEmpilhavel;
import supermercado.revistas.RevistasPilhaEstatica;

import java.util.List;

public class ImprimeRelatorio {

    public static Produto[] imprimirRelatorio(CarrinhoDeCompras carrinho) {
        List<Produto> produtosComprados = carrinho.getProdutosComprados();
        double valorTotal = carrinho.getValorTotal();

        System.out.println("Lista de Produtos Comprados:");
        for (Produto produto : produtosComprados) {
            System.out.println("Nome: " + produto.getNome());
            System.out.println("Preço: R$" + produto.getPreco());
            System.out.println();
        }

        System.out.println("O total da compra é: R$" + valorTotal);



        // Converte a lista de produtos em um array de produtos
        Produto[] produtosArray = produtosComprados.toArray(new Produto[0]);

        return produtosArray;
    }
}
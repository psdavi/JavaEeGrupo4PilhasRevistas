package supermercado.produtos;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Produto> produtosComprados = new ArrayList<>();
    private double valorTotal = 0.0;

    public void adicionarProduto(Produto produto) {
        produtosComprados.add(produto);
        valorTotal += produto.getPreco();
    }

    public List<Produto> getProdutosComprados() {
        return produtosComprados;
    }

    public double getValorTotal() {
        return valorTotal;
    }
}
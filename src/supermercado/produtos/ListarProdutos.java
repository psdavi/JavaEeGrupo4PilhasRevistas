package supermercado.produtos;

public class ListarProdutos {

    public static Produto[] listarProdutos() {
        // Chame o método obterProdutos da classe Produto para obter o array de produtos
        Produto[] produtos = Produto.obterProdutos();

        // Agora você pode usar o array de produtos conforme necessário
        for (Produto produto : produtos) {
            System.out.println("Código: " + produto.getCodigo());
            System.out.println("Nome: " + produto.getNome());
            System.out.println("Preço: R$" + produto.getPreco());
            System.out.println();
        }
        return produtos;
    }
}



package supermercado.produtos;

public class Produto {
    private int codigo;
    private String nome;
    private double preco;

    // Construtor
    public Produto(int codigo, String nome, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
    }

    // Gette
    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public static Produto[] obterProdutos() {
        Produto[] produtos = new Produto[33];

        // Adicionar os produtos ao array
        produtos[0] = new Produto(1, "Açúcar Refinado 1Kg", 2.15);
        produtos[1] = new Produto(2, "Detergente Líquido Incolor 500ml", 1.39);
        produtos[2] = new Produto(3, "Nuggets Tradicional 300g", 3.98);
        produtos[3] = new Produto(4, "Água Sanitária 2L", 3.98);
        produtos[4] = new Produto(5, "Extrato de Tomate 340g", 3.74);
        produtos[5] = new Produto(6, "Óleo de Soja 900ml", 3.10);
        produtos[6] = new Produto(7, "Amaciante 2L", 11.58);
        produtos[7] = new Produto(8, "Farinha de Trigo 1Kg", 2.28);
        produtos[8] = new Produto(9, "Pão de Forma Tradicional 500g", 5.85);
        produtos[9] = new Produto(10, "Arroz Branco 5Kg", 13.98);
        produtos[10] = new Produto(11, "Feijão 1Kg", 3.28);
        produtos[11] = new Produto(12, "Papel Higiênico 30m (4un)", 6.45);
        produtos[12] = new Produto(13, "Azeite Tipo Extravirgem 500ml", 17.90);
        produtos[13] = new Produto(14, "Gim 750ml", 89.90);
        produtos[14] = new Produto(15, "Refrigerante 1,5L", 5.49);
        produtos[15] = new Produto(16, "Barra de Chocolate 135g", 5.99);
        produtos[16] = new Produto(17, "Hambúrguer de Frango e Boi 672g", 12.75);
        produtos[17] = new Produto(18, "Requeijão Cremoso Tradicional 200g", 2.99);
        produtos[18] = new Produto(19, "Bolacha Recheada de Chocolate 136g", 1.88);
        produtos[19] = new Produto(20, "Iogurte de Morango 40g (8un)", 3.99);
        produtos[20] = new Produto(21, "Sabão em Pó 1Kg", 7.99);
        produtos[21] = new Produto(22, "Bombons Sortidos 300g", 7.98);
        produtos[22] = new Produto(23, "Lã de Aço 60g (8un)", 1.86);
        produtos[23] = new Produto(24, "Sabonete 90g", 1.22);
        produtos[24] = new Produto(25, "Café em Pó Tradicional 500g", 11.88);
        produtos[25] = new Produto(26, "Leite Condensado 395g", 3.98);
        produtos[26] = new Produto(27, "Sal Refinado 1Kg", 2.19);
        produtos[27] = new Produto(28, "Cerveja 350ml", 2.39);
        produtos[28] = new Produto(29, "Leite UHT Integral 1L", 2.18);
        produtos[29] = new Produto(30, "Sorvete Napolitano 1,5L", 17.50);
        produtos[30] = new Produto(31, "Cerveja 500ml", 12.70);
        produtos[31] = new Produto(32, "Macarrão com Ovos Parafuso 500g", 2.65);
        produtos[32] = new Produto(33, "Suco Pronto para Consumo Néctar 1L", 4.92);

        return produtos;
    }
}

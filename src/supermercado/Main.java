package supermercado;
import supermercado.produtos.*;
import supermercado.produtos.ListarProdutos;
import supermercado.produtos.ImprimeRelatorio;
import supermercado.revistas.RevistasEmpilhavel;
import supermercado.revistas.RevistasPilhaEstatica;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class Main {

    public static void Menu() {
        RevistasEmpilhavel pilha = new RevistasPilhaEstatica(5);
        Scanner scanner = new Scanner(System.in);

        int opcao = 0;

        supermercado.produtos.CarrinhoDeCompras carrinho = null;

        do {
            System.out.println("");
            System.out.println("****************************************");
            System.out.println("BEM VINDO(A) AO SISTEMA DO SUPERMERCADO!!");
            System.out.println("****************************************");
            System.out.println("Escolha uma das opções abaixo:");
            System.out.println("");
            System.out.println("1 - Realizar uma nova Compra");
            System.out.println("2 - Consultar a lista de produtos");
            System.out.println("");
            System.out.println("3 - Cadastrar Revista");
            System.out.println("5 - Visualizar Pilha de Revistas");
            System.out.println("6 - Espiar Revista do Topo da Pilha");
            System.out.println("9 - Sair");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 3:
                    System.out.println("Digite o título da revista:");
                    scanner.nextLine();
                    String titulo = scanner.nextLine();
                    System.out.println("Digite o ano de edição da revista:");
                    int anoEdicao = scanner.nextInt();
                    System.out.println("Digite o mês de publicação da revista:");
                    int mesPubli = scanner.nextInt();
                    System.out.println("Digite o ano de publicação da revista:");
                    int anoPubli = scanner.nextInt();
                    System.out.println("Digite o número de volume da revista:");
                    int numVolume = scanner.nextInt();

                    LocalDateTime dataAtual = LocalDateTime.now();
                    // Crie um objeto DateTimeFormatter com o padrão desejado
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss dd/MM/yyyy");
                    // Formate a data e hora usando o objeto DateTimeFormatter
                    String dataEmpilhamento = dataAtual.format(formatter);

                    pilha.empilhar(titulo, anoEdicao, mesPubli, anoPubli, numVolume, dataEmpilhamento);
                    break;

                //case 4:
                    //pilha.desempilhar();
                    //break;

                case 5:
                    pilha.imprimir();
                    break;

                case 6:
                    pilha.topo();
                    break;

                case 2:
                    System.out.println("Exibindo Lista de Produtos");
                    ListarProdutos exibirLista = new ListarProdutos();
                    exibirLista.listarProdutos();
                    break;
                case 1:
                    // Crie uma instância da classe RealizarCompra
                    RealizarCompra realizadorDeCompra = new RealizarCompra();
                    // Chame o método realizarCompra
                    carrinho = realizadorDeCompra.realizarCompra();

                    double valor = carrinho.getValorTotal();

                    int i = (int) (valor / 100);
                    int x = 0;
                    while (i != 0) {
                        if (!pilha.estaVazia()) {
                            pilha.desempilhar();
                            i--;
                            x++;
                        }else{
                            i = 0;
                            System.err.println("Infelizmente esgotaram as Revistas!");
                        }
                    }
                    System.out.println("Voce ganhou " + x + " revistas");

                    ImprimeRelatorio.imprimirRelatorio(carrinho);

                    break;

                case 9:
                    System.out.println("Encerrando o programa. Adeus!");
                    break;

                default:
                    System.out.println("Opção inválida. Escolha novamente.");
            }

        } while (opcao != 9);
    }


   public static void main(String[] args) {
       Menu();
   }
}


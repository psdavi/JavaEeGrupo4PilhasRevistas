package supermercado.revistas;

import java.time.LocalDateTime;

public class RevistasPilhaEstatica implements RevistasEmpilhavel {
    private int tamanhoMaximo;
    private int ponteiroTopo;
    private Revista[] dados;

    public RevistasPilhaEstatica(int tamanhoMaximo) {
        this.tamanhoMaximo = tamanhoMaximo;
        this.dados = new Revista[tamanhoMaximo];
        this.ponteiroTopo = -1;
    }

    @Override
    public void empilhar(String titulo, int anoEdicao, int mesPubli, int anoPubli, int numVolume, String dataEmpilhamento) {
        if (!estaCheia()) {
            ponteiroTopo++;
            dados[ponteiroTopo] = new Revista(titulo, anoEdicao, mesPubli, anoPubli, numVolume, dataEmpilhamento); // Crie uma instância de Revista
            //System.out.println("Situação da pilha de Revistas = " + "\n" + imprimir());
            System.out.println("Revista Empilhada com sucesso!");
        } else {
            System.err.println("Pilha de Revistas já atingiu o limite!");
        }
    }

    @Override
    public String imprimir() {
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i <= ponteiroTopo; i++) {
            resultado.append("\nTítulo: ");
            resultado.append(dados[i].getTitulo());
            resultado.append("\nAno de Edição: ");
            resultado.append(dados[i].getAnoEdicao());
            resultado.append("\nMês de Publicação: ");
            resultado.append(dados[i].getMesPubli());
            resultado.append("\nAno de Publicação: ");
            resultado.append(dados[i].getAnoPubli());
            resultado.append("\nNúmero de Volume: ");
            resultado.append(dados[i].getNumVolume());
            resultado.append("\nData de Empilhamento: ");
            resultado.append(dados[i].getDataEmpilhamento());
            resultado.append("\n\n");
        }
        if(!estaVazia()) {
            System.out.println("");
            System.out.println("----- Visualizando Pilha de Revistas -----");
            System.out.println("");
            System.out.println(resultado);
            System.out.println("------------------------------------------");
        }else{
            System.err.println("Esgotaram as Revistas!");
        }

        return resultado.toString();
    }

    @Override
    public Object desempilhar() {
        Object elementoTopo = null;
        if(!estaVazia()) {
            elementoTopo = dados[ponteiroTopo];
            ponteiroTopo--;
        } else {
            System.err.println("Esgotaram as Revistas!");
        }
        return elementoTopo;
    }

    @Override
    public Object topo() {
        Object elementoTopo = null;
        if (!estaVazia()) {
            elementoTopo = dados[ponteiroTopo];
        } else {
            System.err.println("Pilha Vazia");
        }
        return elementoTopo;
    }
    //métodos auxiliares
    @Override
    public boolean estaCheia() {
        return (ponteiroTopo == dados.length - 1);
    }

    @Override
    public boolean estaVazia(){
        return (ponteiroTopo == -1);
    }
}


package supermercado.revistas;

import java.time.LocalDateTime;

public interface RevistasEmpilhavel {
    //métodos principais
    void empilhar(String titulo, int anoEdicao, int mesPubli, int anoPubli, int numVolume, String dataEmpilhamento);
    Object desempilhar();
    Object topo();
    //métodos auxiliares
    boolean estaCheia();
    boolean estaVazia();
    String imprimir();
}
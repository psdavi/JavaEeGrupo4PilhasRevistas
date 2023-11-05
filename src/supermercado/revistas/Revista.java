package supermercado.revistas;
import java.time.LocalDateTime;

public class Revista {
    private String titulo;
    private int anoEdicao;
    private int mesPubli;
    private int anoPubli;
    private int numVolume;
    private String dataEmpilhamento;


    public Revista(String titulo, int anoEdicao, int mesPubli, int anoPubli, int numVolume, String dataEmpilhamento) {
        this.titulo = titulo;
        this.anoEdicao = anoEdicao;
        this.mesPubli = mesPubli;
        this.anoPubli = anoPubli;
        this.numVolume = numVolume;
        this.dataEmpilhamento = dataEmpilhamento;
    }

    public String getTitulo() {
        return titulo;
    }
    public int getAnoEdicao() {
        return anoEdicao;
    }
    public int getMesPubli() {
        return mesPubli;
    }
    public int getAnoPubli() {
        return anoPubli;
    }
    public int getNumVolume() {
        return numVolume;
    }
    public String getDataEmpilhamento() {
        return dataEmpilhamento;
    }
}

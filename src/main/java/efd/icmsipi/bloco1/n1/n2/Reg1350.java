package efd.icmsipi.bloco1.n1.n2;

import java.util.List;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.bloco1.n1.n2.n3.Reg1360;
import efd.icmsipi.bloco1.n1.n2.n3.Reg1370;
import lombok.Getter;
import lombok.Setter;


public class Reg1350 {

    @Getter @Inclui
    private final String reg = "1350";

    @Getter @Setter @Inclui
    private String serie;

    @Getter @Setter @Inclui
    private String fabricante;

    @Getter @Setter @Inclui
    private String modelo;

    @Getter @Setter @Inclui
    private String tipoMedicao;

    @Getter @Setter @Filho
    private List<Reg1360> reg1360;

    @Getter @Setter @Filho
    private List<Reg1370> reg1370;

    public Reg1350(String serie, String fabricante, String modelo, String tipoMedicao) {
        this.serie = serie;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.tipoMedicao = tipoMedicao;
    }

    public Reg1350(){}
}
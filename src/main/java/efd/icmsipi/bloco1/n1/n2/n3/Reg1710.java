package efd.icmsipi.bloco1.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Reg1710 {

    @Inclui
    private final String reg = "1710";

    @Inclui
    private Integer numDocIni;

    @Inclui
    private Inclui numDocFin;

    public Reg1710(Integer numDocIni, Inclui numDocFin) {
        this.numDocIni = numDocIni;
        this.numDocFin = numDocFin;
    }

    public Reg1710(){}
}
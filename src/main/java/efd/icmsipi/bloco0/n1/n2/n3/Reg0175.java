package efd.icmsipi.bloco0.n1.n2.n3;

import java.time.LocalDate;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;


public class Reg0175 {

    @Getter @Inclui
    private final String reg = "0175";

    @Getter @Setter @Inclui
    private LocalDate dtAlt;

    @Getter @Setter @Inclui
    private String nrCampo;

    @Getter @Setter @Inclui
    private String contAnt;

    public Reg0175(LocalDate dtAlt, String nrCampo, String contAnt) {
        this.dtAlt = dtAlt;
        this.nrCampo = nrCampo;
        this.contAnt = contAnt;
    }

    public Reg0175(){}

}

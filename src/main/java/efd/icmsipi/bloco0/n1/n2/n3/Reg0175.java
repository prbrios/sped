package efd.icmsipi.bloco0.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Reg0175 {

    @Inclui
    private final String reg = "0175";

    @Inclui
    private LocalDate dtAlt;

    @Inclui
    private String nrCampo;

    @Inclui
    private String contAnt;

    public Reg0175(LocalDate dtAlt, String nrCampo, String contAnt) {
        this.dtAlt = dtAlt;
        this.nrCampo = nrCampo;
        this.contAnt = contAnt;
    }

    public Reg0175(){}

}

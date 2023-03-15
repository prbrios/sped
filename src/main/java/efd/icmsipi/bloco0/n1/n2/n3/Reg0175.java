package efd.icmsipi.bloco0.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;


public class Reg0175 implements Serializable {
	private static final long serialVersionUID = 1850257692408479694L;

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

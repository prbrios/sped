package efd.icmsipi.bloco0.n1.n2.n3;

import efd.anotacoes.Inclui;

import java.io.Serializable;
import java.time.LocalDate;

public class Reg0175 implements Serializable {
	private static final long serialVersionUID = 1850257692408479694L;

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

    public String getReg() {
        return reg;
    }

    public LocalDate getDtAlt() {
        return dtAlt;
    }

    public void setDtAlt(LocalDate dtAlt) {
        this.dtAlt = dtAlt;
    }

    public String getNrCampo() {
        return nrCampo;
    }

    public void setNrCampo(String nrCampo) {
        this.nrCampo = nrCampo;
    }

    public String getContAnt() {
        return contAnt;
    }

    public void setContAnt(String contAnt) {
        this.contAnt = contAnt;
    }
    

}

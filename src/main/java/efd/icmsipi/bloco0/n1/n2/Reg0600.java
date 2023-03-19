package efd.icmsipi.bloco0.n1.n2;

import efd.anotacoes.Inclui;

import java.io.Serializable;
import java.time.LocalDate;

public class Reg0600 implements Serializable {
	private static final long serialVersionUID = 7121358299613996090L;

	@Inclui
    private final String reg = "0600";

    @Inclui
    private LocalDate dtAlt;

    @Inclui
    private String codCcus;

    @Inclui
    private String ccus;

    public Reg0600(LocalDate dtAlt, String codCcus, String ccus) {
        this.dtAlt = dtAlt;
        this.codCcus = codCcus;
        this.ccus = ccus;
    }

    public Reg0600(){}

    public String getReg() {
        return reg;
    }

    public LocalDate getDtAlt() {
        return dtAlt;
    }

    public void setDtAlt(LocalDate dtAlt) {
        this.dtAlt = dtAlt;
    }

    public String getCodCcus() {
        return codCcus;
    }

    public void setCodCcus(String codCcus) {
        this.codCcus = codCcus;
    }

    public String getCcus() {
        return ccus;
    }

    public void setCcus(String ccus) {
        this.ccus = ccus;
    }
    
}

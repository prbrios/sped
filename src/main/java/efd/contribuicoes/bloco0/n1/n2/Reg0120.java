package efd.contribuicoes.bloco0.n1.n2;

import efd.anotacoes.Inclui;

import java.io.Serializable;
import java.time.LocalDate;

public class Reg0120 implements Serializable {
	private static final long serialVersionUID = -7501036524565434658L;

	@Inclui
	private final String reg = "0120";

    @Inclui(formatoData = "MMyyyy")
    private LocalDate mesRefer;

    @Inclui
    private String infComp;

    public Reg0120(LocalDate mesRefer, String infComp) {
        this.mesRefer = mesRefer;
        this.infComp = infComp;
    }

    public Reg0120(){}

    public String getReg() {
        return reg;
    }

    public LocalDate getMesRefer() {
        return mesRefer;
    }

    public void setMesRefer(LocalDate mesRefer) {
        this.mesRefer = mesRefer;
    }

    public String getInfComp() {
        return infComp;
    }

    public void setInfComp(String infComp) {
        this.infComp = infComp;
    }
    
}

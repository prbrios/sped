package efd.contribuicoes.blocoF.n1.n2.n3.n4;

import java.io.Serializable;

import efd.anotacoes.Inclui;

public class RegF559 implements Serializable {
	private static final long serialVersionUID = 8518688920552422771L;

	@Inclui
	private final String reg = "F559";

    @Inclui
    private String codProc;

    @Inclui
    private String indProc;

    public RegF559(String codProc, String indProc) {
        this.codProc = codProc;
        this.indProc = indProc;
    }

    public RegF559(){ }

    public String getReg() {
        return reg;
    }

    public String getCodProc() {
        return codProc;
    }

    public void setCodProc(String codProc) {
        this.codProc = codProc;
    }

    public String getIndProc() {
        return indProc;
    }

    public void setIndProc(String indProc) {
        this.indProc = indProc;
    }
    
}
